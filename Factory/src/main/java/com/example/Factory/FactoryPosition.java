package com.example.Factory;

public class FactoryPosition {

    public UsersPosition getPosition(String typePosition){
        if(typePosition == null){
            return null;
        }
        if (typePosition.equalsIgnoreCase("PL")){
            return new ProjectLeader();
        }else if(typePosition.equalsIgnoreCase("FA")){
            return new FuntionalAnalyst();
        }else if(typePosition.equalsIgnoreCase("DE")){
            return  new Developer();
        }else if(typePosition.equalsIgnoreCase("QA")){
            return  new QA();
        }else if(typePosition.equalsIgnoreCase("ERS")){
            return new ERS();
        }
        return null;
    }


}
