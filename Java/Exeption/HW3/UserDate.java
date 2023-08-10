package Java.Exeption.HW3;


import java.util.Arrays;
import java.util.List;

public class UserDate {   
    
    public UserDate(List<String> list){
        StringBuilder sb = new StringBuilder();
        String name = name(list);
        String dateOfBirthday = dateOfBirthday(list);
        long phone = phone(list);
        String gender = gender(list);
        sb.append(name + ", ");
        sb.append(dateOfBirthday + ", ");
        sb.append(phone + ", ");
        sb.append(gender);
        System.out.println(sb);
    }

    
    public String name(List<String> args){
        String name = null;
        try {
            for (int i = 0; i < args.size(); i++){
                if (args.get(i).split(" ").length == 3){
                    name = args.get(i);                    
                }
            }             
        } catch(NullPointerException e){
            System.out.println("Некорректно введено имя. Попробуйте снова");
        }
        return name;    
    }

    public Long phone(List<String> args){
        long phone = 0;
        try{
            for (int i = 0; i < args.size(); i++){
                if (args.get(i).length() == 11){                    
                    phone = Long.parseLong(args.get(i));                    
                }
            } 
        } catch(NullPointerException e){
            System.out.println("Отсутствует номер телефона. Попробуйте снова");
        } catch(NumberFormatException e){
            System.out.println("В номере телефона ошибка. Придётся начать всё");
        }
        return phone;
        
    }

    public String dateOfBirthday(List<String> args){
        String DOB = null;
        String[] date;
        try{
            for (int i = 0; i < args.size(); i++){
                if (args.get(i).split("\\.").length == 3){
                    date = args.get(i).split("\\.");
                    int day = Integer.parseInt(date[0]);
                    int month = Integer.parseInt(date[1]);
                    int year = Integer.parseInt(date[2]);
                    System.out.println(date);
                    if (year >= 1900 && year <= 2022){
                        if (date[1].length() == 2 && month > 0 && month <= 12){
                            if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
                                if (date[0].length() == 2 && day > 0 && day < 32){
                                    DOB = args.get(i);
                                } else {
                                    if (month == 4 || month == 6 || month == 9 || month == 11){
                                        if (date[0].length() == 2 && day > 0 && day < 31){
                                        DOB = args.get(i);
                                        }
                                    } else {
                                        if (month == 2){
                                            if (date[0].length() == 2 && day > 0 && day < 29){
                                                DOB = args.get(i);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } 
        } catch(NullPointerException e){
            System.out.println("Введена не верная дата рождения. Попробуйте снова");
        } catch(NumberFormatException e){
            System.out.println("Дата рождения введена с ошибкой. Придётся начать всё сначала.");
        }
        return DOB;
    }

    public String gender(List<String> args){
        String gender = null;
        try{            
            String gen;
            String[] m = {"male", "m", "man"};
            String[] f = {"famale", "f", "woman", "w"};
            for (int i = 0; i < args.size(); i++){
                if (args.get(i).split("").length < 10){
                    gen = args.get(i);
                    System.out.println(gen);
                    if (Arrays.asList(m).contains(gen) == true){
                        gender = "m";
                    }
                    else {
                        if (Arrays.asList(f).contains(gen) == true){
                            gender = "f";
                        }
                    }
                }
            } 
        } catch(NullPointerException e){
            System.out.println("Не верный формат пола. Попробуйте снова");
        } 
        return gender;
    }

    public String lastName(List<String> args){
        String lastName = null;
        String[] list;
        for (int i = 0; i < args.size(); i++){
            if (args.get(i).split(" ").length == 3){
                list = args.get(i).split(" ");
                lastName = list[0];                    
            }
        }
        return lastName;
    }
}