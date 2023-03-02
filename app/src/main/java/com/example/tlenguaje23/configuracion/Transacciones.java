package com.example.tlenguaje23.configuracion;

public class Transacciones
{
    //nombre  de bd
    public static final String NameDatabase = "TLENG";

    //Creacion de tablas y Objetos
    public static final String tablapersonas = "personas";


    /*Capos de las tablas personas*/
    public static String id="id";
    public static String nombres="nombres";
    public static String apellidos="apellidos";
    public static String edad="edad";
    public static String coreo="coreo";

    //Consultas SQL DDL
    public static String CreateTBPersonas = "CREATE TABLE personas (id INTERGER PRIMARY KEY AUTOINCREMENT)"+
            "nombres TEXT, apellidos TEXT, edad TEXT, coreo TEXT)";
    public  static String DropTBPersonas = "DROP TABLE IF EXIST personas";



}

