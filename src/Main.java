public class Main {
    public static void main(String[] args) {
//Задание 2
        int clientAndroid = 1;
        int clientDeviceYear = 2014;

        if (clientAndroid == 1 && clientDeviceYear >= 2015)
        {System.out.println("Установите приложение для андроид");}
            else if (clientAndroid == 1 && clientDeviceYear < 2015)
        {System.out.println( "Установите облегчённую версию для андроид");}
            else if (clientAndroid == 0 && clientDeviceYear >= 2015)
        {System.out.println( "Установите приложение для IOS");}
            else
            {System.out.println( "Установите облегчённую версию для IOS");}



        }

    }
