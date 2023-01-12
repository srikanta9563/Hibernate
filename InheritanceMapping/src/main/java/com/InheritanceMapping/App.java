package com.InheritanceMapping;

import com.vehicle.daoimpl.DaoImpl;

public class App 
{
    public static void main( String[] args )
    {
       DaoImpl dao= new DaoImpl();
       dao.addVehicle();
    }
}
