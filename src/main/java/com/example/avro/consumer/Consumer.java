package com.example.avro.consumer;

import java.io.IOException;
import java.io.File;

import com.example.avro.entity.Customer;
import org.apache.avro.file.DataFileReader;

import org.apache.avro.io.DatumReader;

import org.apache.avro.specific.SpecificDatumReader;


public class Consumer {


    public static void main(String[] args)throws IOException {

        deSerailizeMessage();

    }



    public static void deSerailizeMessage()throws IOException{

        File file = new File("customer.avro");

        DatumReader<Customer> datumReader = new SpecificDatumReader<Customer>(Customer.class);

        DataFileReader<Customer> dataFileReader= new DataFileReader<Customer>(file,datumReader);

        Customer customer=null;

        while(dataFileReader.hasNext()){

            customer=dataFileReader.next(customer);

            System.out.println(customer);

        }

    }

}
