package com.company.homework3;

public class Titlecorrectionstring{

    String str = "";
    int c = 0;

    public String Titlecorrectionstring(String str){
        this.str = str;

        // удаляем пробелы в начале и конце строки, лишние двойные пробелы (если они были случайно введены) и переводим название в нижний регистр
        str = str.trim();
        str = str.replaceAll("  ", " ");
        str = str.toLowerCase();

        // преобразуем символы (все кроме букв) в пробелы
        char[] charArray = str.toCharArray();
        for(int i = 0; i < charArray.length; i++) {
            c = (int) charArray[i];
            if(c < 1040){
                charArray[i] = (char)32;
            }else if (c > 1105){
                charArray[i] = (char)32;
            }
        }

        // преобразуем массив в строку и удаляем лишние пробелы появившиеся после преобразования символов в пробелы
        String newStr = "";
        for(int i = 0; i < charArray.length; i++) {
            newStr = newStr + charArray[i];
        }
        String filmAfterCorrection = newStr.replaceAll("  ", " ");
        System.out.println("\n" + "Название фильма, которое будет использоваться в HashSet:" + "\n" + filmAfterCorrection);

        return filmAfterCorrection;
    }
}