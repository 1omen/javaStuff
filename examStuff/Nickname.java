public class Nickname extends Text {


    public Nickname(String nickname) {
        if (nickname.length() <= 20) {
            this.textContent = nickname;
            this.defaultTextContent = nickname;
        } else {
            System.out.println(Red + "INPUT ERROR: Your nickname should be 20 chars or less." + "\u001B[0m");
            this.textContent = null;
            this.defaultTextContent = null;
        }

    }

    public String getNick() {
        return textContent;
    }

    boolean spaceDone = false; // если сделан, то криво работает register метод
    boolean sidingsDone = false;
    boolean registerDone = false;
    int sidingsLength = 2; // в планах зада

    public void setStyle(Style type) {
        if (textContent != null) {
            switch (type) {
                case register:
                    if (registerDone != true) {
                        char[] registeredString = textContent.toCharArray();
                        int a;
                        if (spaceDone == true) {
                            a = 2;
                        } else {
                            a = 1;
                        }
                        if (sidingsDone == true) {
                            a += 2;
                        }
                        for (int i = a; i < registeredString.length; i += 2) {
                            registeredString[i] = Character.toUpperCase(registeredString[i]);
                        }
                        textContent = String.valueOf(registeredString);
                        System.out.println(Italic + "Your nickname is upgraded with " + Bold + "rEgIsTeR" + None + " method!" + None);
                    } else {
                        System.out.println(Red + "The register method already applied!" + None);
                    }
                    break;
                case space:
                    if (spaceDone != true) {
                        char[] underscoreString = textContent.toCharArray();
                        String finalString = "";
                        if (sidingsDone == true) {
                            finalString += "_-";
                            for (int i = 2; i < underscoreString.length - (sidingsLength + 1); i++) {
                                finalString += underscoreString[i] + "_";
                            }
                            finalString += underscoreString[underscoreString.length - (sidingsLength + 1)];
                            finalString += "-_";
                        } else {
                            for (int i = 0; i < underscoreString.length - 1; i++) {
                                finalString += underscoreString[i] + "_";
                            }
                            finalString += underscoreString[underscoreString.length - 1];
                        }
                        textContent = finalString;
                        System.out.println(Italic + "Your nickname is upgraded with " + Bold + "s_p_a_c_e" + None + " method!" + None);
                        spaceDone = true;
                    } else {
                        System.out.println(Red + "The s_p_a_c_e method already applied!" + None);
                    }
                    break;
                case sidings:
                    if (sidingsDone != true) {
                        textContent = "_-" + textContent + "-_";
                        System.out.println(Italic + "Your nickname is upgraded with " + Bold + "sidings!" + None);
                        sidingsLength = 2;
                        sidingsDone = true;
                    } else {
                        System.out.println(Red + "The sidings are already applied!" + None);
                    }
                    break;
                case allInOne:
                    textContent = defaultTextContent;
                    sidingsDone = false;
                    spaceDone = false;
                    registerDone = false;
                    this.setStyle(Style.register);
                    this.setStyle(Style.space);
                    this.setStyle(Style.sidings);
                    System.out.println(Italic + "Your nickname is upgraded to it's" + Bold + " MAXIMUM!" + None);
                    break;
            }
        } else {
            System.out.println(Red + "STYLE ERROR: No nickname provided." + None);
        }
    }

//    @Override
//    public void print() {
//
//        if (string != null) {
//            System.out.println(string);
//        } else {
//            System.out.println(Red + "PRINT ERROR: No nickname provided." + "\u001B[0m");
//        }
//    }
}
