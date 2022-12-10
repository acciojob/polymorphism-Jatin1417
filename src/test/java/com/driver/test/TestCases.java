package com.driver.test;

import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;

import com.driver.Main;
import com.driver.Main.Product;

public class TestCases {
   public static void main(String args[]){
    Product p = new Product();
    System.out.println(p.product(2,4));
    System.out.println(p.product(2,4,6));
    System.out.println(p.product(2.0,4.0));
   }

}
