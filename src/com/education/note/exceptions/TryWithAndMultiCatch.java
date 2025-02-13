package com.education.note.exceptions;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TryWithAndMultiCatch {

    public static void main(String[] args) throws SQLException {



        try(

                Connection con = null;
                Statement st =null;

                ){

            // con =DM.getCOnnection
            //  st = con.createStatement();

        }




    }
}


