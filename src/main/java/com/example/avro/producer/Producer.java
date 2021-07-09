package com.example.avro.producer;

import java.io.File;

import java.io.IOException;

import com.example.avro.dto.User;
import com.example.avro.entity.Customer;
import org.apache.avro.file.DataFileWriter;

import org.apache.avro.io.DatumWriter;

import org.apache.avro.specific.SpecificDatumWriter;
import org.springframework.web.client.RestTemplate;


public class Producer {


    public static void main(String[] args)throws IOException {

        serailizeMessage();

    }

    public static void serailizeMessage()throws IOException{



        DatumWriter<Customer> datumWriter = new SpecificDatumWriter<Customer>(Customer.class);

        DataFileWriter<Customer> dataFileWriter = new DataFileWriter<Customer>(datumWriter);

        File file = new File("customer.avro");

        Customer customer=new Customer();

        dataFileWriter.create(customer.getSchema(), file);

        String url="https://jsonplaceholder.typicode.com/users";
        RestTemplate template=new RestTemplate();
        Customer[] dto=template.getForObject(url, Customer[].class);
        for(int i=0;i<dto.length;i++){

            customer.setId(dto[i].getId());

            customer.setName(dto[i].getName());

            customer.setEmail(dto[i].getEmail());
            customer.setPhone(dto[i].getPhone());
            customer.setUsername(dto[i].getUsername());
            customer.setWebsite(dto[i].getWebsite());
            customer.setAddress(dto[i].getAddress());
            customer.setCompany(dto[i].getCompany());
            dataFileWriter.append(customer);
        }

        dataFileWriter.close();

    }

}