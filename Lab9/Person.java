class Person {
    String name_;
    String surname_;
    String address_;

    public Person(String name, String surname, String adress){
        name_ = name;
        surname_ = surname;
        address_ = adress;
    }

    public void PrintInfo(){
        System.out.printf("Name: %s \nSurname: %s\nAdress: %s\n", name_, surname_, address_);
    }

    public int Length(String str){
        return str.length();
    }

    public char FirstLetter(String str){
        return str.charAt(0);
    }

    public String Item(int start, int finish){
        return this.address_.substring(start, finish);
    }
    public String ChangeAddress(String[] from, String[] to){
        String res = this.address_;
        for(int i = 0; i < from.length; i++){
            res = res.replace(from[i], to[i]);
        }
        return res;
    }

    public String ToLow(String str){
        return str.toLowerCase();
    }

    public String ToUp(String str){
        return str.toUpperCase();
    }

    public boolean Compare(String str2){
        return this.surname_.equals(str2);
    }

    public String Plus(){
        return this.surname_.concat(" Surname");
    }

    public String Cheer(){
        String country = this.address_.substring(0, 7);
        return country.repeat(3);
    };

    public boolean NameMeaning(String str){
        return this.name_.endsWith(str);
    }

    public boolean Country(){
        return this.address_.contains("Russia");
    }


}