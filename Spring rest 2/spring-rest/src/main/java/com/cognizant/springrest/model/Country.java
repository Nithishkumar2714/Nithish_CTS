package com.cognizant.springrest.model;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

public class Country {
    private static final Logger LOGGER=LoggerFactory.getLogger(Country.class);
    private String code;
    private String name;
    public Country(){

    }
        public Country(String code,String name){
            this.code=code;
            this.name=name;
        }
        public String getCode(){
        return code;
        }
        public void setCode(String code){
        this.code=code;
        }
        public String getName(){
        return name;
        }
        public void setName(String name){
        this.name=name;
        }
}
