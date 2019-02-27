import java.io.FileWriter;

public class Text {

    public static void main(String[] args) {

        try(FileWriter w = new FileWriter("notes.txt", false)){

            for (int i =1; i <= 80; i++) {

                //Нумерация ПМ СВ Акселерометры
                /*String text1 = "/// Акселерометр " + i + " ///\r\n" +
                "FUNCTION_svetofor(\r\n" +
                "A" + i + "_X_In,\r\n" +
                "A" + i + "_Y_In,\r\n" +
                "A" + i + "_Z_In,\r\n" +
                "A" + i + "_W_R,\r\n" +
                "A" + i + "_Ust_X_Rt,\r\n" +
                "A" + i + "_Ust_X_Yt,\r\n" +
                "A" + i + "_Ust_X_Yb,\r\n" +
                "A" + i + "_Ust_X_Rb,\r\n" +
                "A" + i + "_Ust_Y_Rt,\r\n" +
                "A" + i + "_Ust_Y_Yt,\r\n" +
                "A" + i + "_Ust_Y_Yb,\r\n" +
                "A" + i + "_Ust_Y_Rb,\r\n" +
                "A" + i + "_Ust_Z_Rt,\r\n" +
                "A" + i + "_Ust_Z_Yt,\r\n" +
                "A" + i + "_Ust_Z_Yb,\r\n" +
                "A" + i + "_Ust_Z_Rb,\r\n" +
                "A" + i + "_Virtual_In,\r\n" +
                "A" + i + "_Virtual_HA,\r\n" +
                "A" + i + "_Virtual_HW,\r\n" +
                "A" + i + "_Virtual_LW,\r\n" +
                "A" + i + "_Virtual_LA,\r\n" +
                "_e_OPC_1_In\r\n" +
                ");\r\n" +
                "\r\n";
                w.write(text1 + "\n");

                //Нумерация прог уставки аксел
                String text2 = "/// Акселерометр " + i + " ///\r\n" +
                i + ":\r\n" +
                "FUNCTION_ustavki(\r\n" +
                "A_X_Rt_In, A_X_Yt_In, A_X_Yb_In, A_X_Rb_In,\r\n" +
                "A_Y_Rt_In, A_Y_Yt_In, A_Y_Yb_In, A_Y_Rb_In,\r\n" +
                "A_Z_Rt_In, A_Z_Yt_In, A_Z_Yb_In, A_Z_Rb_In,\r\n" +
                "A_X_Rt__In, A_X_Yt__In, A_X_Yb__In, A_X_Rb__In,\r\n" +
                "A_Y_Rt__In, A_Y_Yt__In, A_Y_Yb__In, A_Y_Rb__In,\r\n" +
                "A_Z_Rt__In, A_Z_Yt__In, A_Z_Yb__In, A_Z_Rb__In,\r\n" +
                "A" + i + "_Ust_X_Rt,\r\n" +
                "A" + i + "_Ust_X_Yt,\r\n" +
                "A" + i + "_Ust_X_Yb,\r\n" +
                "A" + i + "_Ust_X_Rb,\r\n" +
                "A" + i + "_Ust_Y_Rt,\r\n" +
                "A" + i + "_Ust_Y_Yt,\r\n" +
                "A" + i + "_Ust_Y_Yb,\r\n" +
                "A" + i + "_Ust_Y_Rb,\r\n" +
                "A" + i + "_Ust_Z_Rt,\r\n" +
                "A" + i + "_Ust_Z_Yt,\r\n" +
                "A" + i + "_Ust_Z_Yb,\r\n" +
                "A" + i + "_Ust_Z_Rb\r\n" +
                ");\r\n" +
                "Текст_номер_АКСЕЛ_CMNT = 'Аксел " + i + "';\r\n" +
                "\r\n";
                w.write(text2 + "\n");

                //Нумерация датчиков для Exel
                String s3 = "Tenz" + i + "_W" + "\r\n";
                w.write(s3);

                String s4 = "A" + i + "_Virtual_In,\r\n" +
                        "A" + i + "_Virtual_HA,\r\n" +
                        "A" + i + "_Virtual_HW,\r\n" +
                        "A" + i + "_Virtual_LW,\r\n" +
                        "A" + i + "_Virtual_LA," +
                        "\r\n";
                w.write(s4);*/

                /*String s5 =  "///Акселерометр " + i + "///\r\n" +
                        i + ":\r\n" +
                        "FUNCTION_graphik(\r\n" +
                        "A" + i + "_X_R,\r\n" +
                        "A" + i + "_Y_R,\r\n" +
                        "A" + i + "_Z_R,\r\n" +
                        "A" + i + "_Ust_X_Rt,\r\n" +
                        "A" + i + "_Ust_X_Yt,\r\n" +
                        "A" + i + "_Ust_X_Yb,\r\n" +
                        "A" + i + "_Ust_X_Rb,\r\n" +
                        "A" + i + "_Ust_Y_Rt,\r\n" +
                        "A" + i + "_Ust_Y_Yt,\r\n" +
                        "A" + i + "_Ust_Y_Yb,\r\n" +
                        "A" + i + "_Ust_Y_Rb,\r\n" +
                        "A" + i + "_Ust_Z_Rt,\r\n" +
                        "A" + i + "_Ust_Z_Yt,\r\n" +
                        "A" + i + "_Ust_Z_Yb,\r\n" +
                        "A" + i + "_Ust_Z_Rb,\r\n" +
                        "X_In,\r\n" +
                        "Y_In,\r\n" +
                        "Z_In,\r\n" +
                        "X_Rt_In,\r\n" +
                        "X_Yt_In,\r\n" +
                        "X_Yb_In,\r\n" +
                        "X_Rb_In,\r\n" +
                        "Y_Rt_In,\r\n" +
                        "Y_Yt_In,\r\n" +
                        "Y_Yb_In,\r\n" +
                        "Y_Rb_In,\r\n" +
                        "Z_Rt_In,\r\n" +
                        "Z_Yt_In,\r\n" +
                        "Z_Yb_In,\r\n" +
                        "Z_Rb_In\r\n" +
                ");\r\n" +
                "Текст_номнер_Acsel_CMNT = 'Акселерометр A" + i + "';\r\n";

                w.write(s5);*/

               /*String s6 = "///Акселерометр " + i + "///\r\n" +
                "if ((А" + i + "_Virtual_P <> А" + i + "_Virtual_P_) AND (БД_Запись_Ошибок_АКСЕЛ_250_In == 0)) then\r\n" +
                        "БД_Запись_Ошибок_АКСЕЛ_250_Sensor = " + i + ";\r\n" +
                "БД_Запись_Ошибок_АКСЕЛ_250_Alert = А" + i + "_Virtual_P ;\r\n" +
                "А" + i + "_Virtual_P_ = А" + i + "_Virtual_P;\r\n" +
                "БД_Запись_Ошибок_АКСЕЛ_250_In = 1;\r\n" +
                "end_if;\r\n" +
                        "\r\n";

                w.write(s6);*/

               /*String s7 = "if ((Разрешение_на_чтение_уставок_Borders_In == 0 ) AND (БД_Чтение_Уставок_уАКСЕЛ_254_In == 0) AND\r\n" +
                        "(	(A16_Ust_X_Rt == 0) AND\r\n" +
                                "(A" + i + "_Ust_X_Yt == 0)  AND\r\n" +
                                "(A" + i + "_Ust_X_Yb == 0)  AND\r\n" +
                                "(A" + i + "_Ust_X_Rb == 0)  AND\r\n" +
                                "(A" + i + "_Ust_Y_Rt == 0)  AND\r\n" +
                                "(A" + i + "_Ust_Y_Yt == 0)  AND\r\n" +
                                "(A" + i + "_Ust_Y_Yb == 0)  AND\r\n" +
                                "(A" + i + "_Ust_Y_Rb == 0)  AND\r\n" +
                                "(A" + i + "_Ust_Z_Rt == 0)  AND\r\n" +
                                "(A" + i + "_Ust_Z_Yt == 0)  AND\r\n" +
                                "(A" + i + "_Ust_Z_Yb == 0)  AND\r\n" +
                                "(A" + i + "_Ust_Z_Rb == 0) )\r\n" +
	") then\r\n" +
                        "БД_Чтение_Уставок_уАКСЕЛ_254_In = " + i + ";\r\n" +
                "end_if;\r\n" +
                       "\r\n";

               w.write(s7);*/


                /*String s8 = i + ":\r\n" +
                "FUNCTION_ustavki(\r\n" +
                        "A_X_In,\r\n" +
                        "A_Y_In,\r\n" +
                        "A_Z_In,\r\n" +
                        "A_X_Rt_In, A_X_Yt_In, A_X_Yb_In, A_X_Rb_In,\r\n" +
                        "A_Y_Rt_In, A_Y_Yt_In, A_Y_Yb_In, A_Y_Rb_In,\r\n" +
                        "A_Z_Rt_In, A_Z_Yt_In, A_Z_Yb_In, A_Z_Rb_In,\r\n" +
                        "A_X_Rt__In, A_X_Yt__In, A_X_Yb__In, A_X_Rb__In,\r\n" +
                        "A_Y_Rt__In, A_Y_Yt__In, A_Y_Yb__In, A_Y_Rb__In,\r\n" +
                        "A_Z_Rt__In, A_Z_Yt__In, A_Z_Yb__In, A_Z_Rb__In,\r\n" +
                        "A" + i + "_X_R,\r\n" +
                        "A" + i + "_Y_R,\r\n" +
                        "A" + i + "_Z_R,\r\n" +
                        "A" + i +"_Ust_X_Rt, A" + i + "_Ust_X_Yt, A" + i + "_Ust_X_Yb, A" + i + "_Ust_X_Rb,\r\n" +
                        "A" + i + "_Ust_Y_Rt, A" + i + "_Ust_Y_Yt, A" + i + "_Ust_Y_Yb, A" + i + "_Ust_Y_Rb,\r\n" +
                        "A" + i + "_Ust_Z_Rt, A" + i + "_Ust_Z_Yt, A" + i + "_Ust_Z_Yb, A" + i + "_Ust_Z_Rb\r\n" +
                ");\r\n" +
                "Текст_номер_АКСЕЛ_CMNT = 'Акселерометр " + i + "';\r\n" +
                        "\r\n";

                w.write(s8);*/


               /*String s9 = "('3', '" + i + "', '#A" + i + "_X_In#', GETDATE()),\r\n" +
                       "('4', '" + i + "', '#A" + i + "_Y_In#', GETDATE()),\r\n" +
                       "('5', '" + i + "', '#A" + i + "_Z_In#', GETDATE()),\r\n" +
                       "\r\n";

               w.write(s9);*/

                /*String s10 =*/
                /*"x" + i + ".RT #A" + i + "_Ust_X_Rt#,\r\n" +
                "x" + i + ".YT #A" + i + "_Ust_X_Yt#,\r\n" +
                "x" + i + ".YB #A" + i + "_Ust_X_Yb#,\r\n" +
                "x" + i + ".RB #A" + i + "_Ust_X_Rb#,\r\n" +
                "x" + i + ".RT #A" + i + "_Ust_Y_Rt#,\r\n" +
                "x" + i + ".YT #A" + i + "_Ust_Y_Yt#,\r\n" +
                "x" + i + ".YB #A" + i + "_Ust_Y_Yb#,\r\n" +
                "x" + i + ".RB #A" + i + "_Ust_Y_Rb#,\r\n" +
                "x" + i + ".RT #A" + i + "_Ust_Z_Rt#,\r\n" +
                "x" + i + ".YT #A" + i + "_Ust_Z_Yt#,\r\n" +
                "x" + i + ".YB #A" + i + "_Ust_Z_Yb#,\r\n" +
                "x" + i + ".RB #A" + i + "_Ust_Z_Rb#,\r\n";*/


                /*"Borders as x" + i + ",\r\n" +
                "Borders as x" + i + ",\r\n" +
                "Borders as x" + i + ",\r\n";*/


                /*"where\r\n" +*/
                /*"x" + i +".Sensor = " + i + " and\r\n";

                w.write(s10);*/

                /*String s11 = "if ((Разрешение_на_чтение_уставок_ТД_In == 0 ) AND (БД_Чтение_Уставок_ТЕНЗОД_295_In == 0) AND\r\n" +
                        "(	(Td16_Ust_HA == 0) AND\r\n" +
                                "(Td16_Ust_HW == 0)  AND\r\n" +
                                "(Td16_Ust_LW == 0)  AND\r\n" +
                                "(Td16_Ust_LA == 0) )\r\n" +
	                    ") then\r\n" +
                        "БД_Чтение_Уставок_ТЕНЗОД_295_In = " + i + ";\r\n" +
                         "end_if;\r\n"+
                        "\r\n";

                w.write(s11);*/






                /*String s12 = "/// Тензодатчик " + i + "///\r\n" +
                "FUNCTION_svetofor(\r\n" +
                        "Td" + i + "_Virtual_In,\r\n" +
                        "Td" + i + "_Virtual_HA,\r\n" +
                        "Td" + i + "_Virtual_HW,\r\n" +
                        "Td" + i + "_Virtual_LW,\r\n" +
                        "Td" + i + "_Virtual_LA,\r\n" +
                        "Td" + i + "_R,\r\n" +
                        "Td" + i + "_Ust_HA,\r\n" +
                        "Td" + i + "_Ust_HW,\r\n" +
                        "Td" + i + "_Ust_LW,\r\n" +
                        "Td" + i + "_Ust_LA,\r\n" +
                        "Td" + i + "_W_VALUE,\r\n" +
                        "_e_OPC_1_In\r\n" +
                ");\r\n" +
                        "\r\n";

                w.write(s12);*/


                /*String s13 = "/// Тензодатчик " + i + "///\r\n" +
                i + ":\r\n" +
                "FUNCTION_ustavki(\r\n" +
                        "Td_In,\r\n" +
                        "Td_HA_In,\r\n" +
                        "Td_HW_In,\r\n" +
                        "Td_LW_In,\r\n" +
                        "Td_LA_In,\r\n" +
                        "Td_HA__In,\r\n" +
                        "Td_HW__In,\r\n" +
                        "Td_LW__In,\r\n" +
                        "Td_LA__In,\r\n" +
                        "Td" + i + "_In,\r\n" +
                        "Td" + i + "_Ust_HA,\r\n" +
                        "Td" + i + "_Ust_HW,\r\n" +
                        "Td" + i + "_Ust_LW,\r\n" +
                        "Td" + i + "_Ust_LA\r\n" +
                ");\r\n" +
                "Текст_номерТД_CMNT = 'Тензодатчик T" + i + "';\r\n";

                w.write(s13);*/

                /*String s14 = "('1', '" + i + "', '#Td" + i + "_In#', GETDATE()),\r\n";
                w.write(s14);*/

                /*String s15 = "select top 1\r\n" +
                "RT #Td" + i + "_Ust_HA#,\r\n" +
                "YT #Td"  + i + "_Ust_HW#,\r\n" +
                "YB #Td" + i + "_Ust_LW#,\r\n" +
                "RB #Td" + i + "_Ust_LA#\r\n" +
                "from Borders\r\n" +
                "where (Measuring = 1 and Sensor = " + i + " and BActive = 1);\r\n" +
                " \r\n";

                w.write(s15);*/

                /*String s16 =

                    "x" + i + ".RB #Td" + i + "_Ust_HA#, x" + i + ".YB #Td" + i + "_Ust_HW#, x" + i + ".YT #Td" + i + "_Ust_LW#, x" + i + ".RT #Td" + i + "_Ust_LA#,\r\n";

                w.write(s16);*/

                /*String s17 = "Borders as x" + i + ", ";

                w.write(s17);*/

                /*String s18 = "x" + i + ".Measuring = 5 and x" + i + ".Sensor = " + i + " and x" + i + ".BActive = 1 and\r\n";

                w.write(s18);*/

                /*String s20 =
                        "x" + i + ".RT #A" + i + "_Ust_X_Rt#, x" + i + ".YT #A" + i + "_Ust_X_Yt#, x" + i + ".YB #A" + i + "_Ust_X_Yb#, x" + i + ".RB #A" + i + "_Ust_X_Rb#,\r\n" +
                        "x" + i + ".RT #A" + i + "_Ust_Y_Rt#, x" + i + ".YT #A" + i + "_Ust_Y_Yt#, x" + i + ".YB #A" + i + "_Ust_Y_Yb#, x" + i + ".RB #A" + i + "_Ust_Y_Rb#,\r\n" +
                        "x" + i + ".RT #A" + i + "_Ust_Z_Rt#, x" + i + ".YT #A" + i + "_Ust_Z_Yt#, x" + i + ".YB #A" + i + "_Ust_Z_Yb#, x" + i + ".RB #A" + i + "_Ust_Z_Rb#,\r\n" +
                                " \r\n";

                w.write(s20);*/

                /*String s21 =
                        "FUNCTION_bd(\r\n" +
                                "Td" + i + "_P,\r\n" +
                                "Td" + i + "_P_,\r\n" +
                                "_Sound_File_2_In);\r\n" +
                                " \r\n";

                w.write(s21);
*/

                String s23 = "Td_"+i+"\r\n";

                w.write(s23);





            }

        } catch (Exception e){



        }

    }
}
