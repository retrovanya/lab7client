package Auth;

import PersonData.*;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

public class InterScanner {
    Flat flati = new Flat();
    long h =0;
    public InterScanner() throws IOException, AllException, AllException {
    }

    public static Flat personCreator() throws AllException, IOException {

        Furnish furnish = null;
        Transport transport = null;
        View view = null;
        System.out.println("Заполните данные для создания квартиры. Если вы допустите ошибку при вводе, то вам будет предложено создать квартиру заново");
        System.out.println("Введите название квартиры: ");
        try{
            Scanner scan = new Scanner(System.in);
            String nameScanner = scan.nextLine();
            Double areaScanner = 0.0;
            while ((areaScanner<=0.0)||(areaScanner>50000)) {
                System.out.println("Введите площадь квартиры (Double), если после ввода вам будет предложен еще один ввод площади, то ваше предыдущее значение некорректно ");

                areaScanner = scan.nextDouble();

            }
            long numberOfRoomsScanner = 0;
            while ((numberOfRoomsScanner<1)||(numberOfRoomsScanner>70)) {
                System.out.println("Введите количество комнат (Целое число), если после ввода вам будет предложен еще один ввод количества комнат, то ваше предыдущее значение некорректно ");



                numberOfRoomsScanner = scan.nextInt();
            }
            Integer FurnishScanner = 0;
            while ((FurnishScanner!=1)&&(FurnishScanner!=2)&&(FurnishScanner!=3)&&FurnishScanner!=4) {
                System.out.println("Выберите отделку(Введите номер варианта):" + "\n" + "1.Дизайнерская" + "\n" + "2.Качественная" + "\n" + "3.Дешевая и плохая" + "\n" + "4.Бетонные стены" +"\n"+
                        "если после ввода вам будет предложен еще один ввод, то ваше предыдущее значение некорректно");


                FurnishScanner = scan.nextInt();
                if (FurnishScanner == 1) furnish = Furnish.designer;
                if (FurnishScanner == 2) furnish = Furnish.fine;
                if (FurnishScanner == 3) furnish = Furnish.bad;
                if (FurnishScanner == 4) furnish = Furnish.little;
            }

            Integer transportScanner = 0;
            while ((transportScanner!=1)&&(transportScanner!=2)&&(transportScanner!=3)) {
                System.out.println("Выберите оживленность траффика за окном(Введите номер варианта):" + "\n" + "1.Машин не много" + "\n" + "2.Траффика вообще нет" + "\n" + "3.Достаточно много автомобилей"+"\n"+
                        "Если после ввода вам будет предложен еще один ввод, то ваше предыдущее значение некорректно");


                transportScanner = scan.nextInt();
                if (transportScanner == 1) transport = Transport.FEW;
                if (transportScanner == 2) transport = Transport.NONE;
                if (transportScanner == 3) transport = Transport.ENOUGH;
            }
            Double coordinateX = 58.0;
            Double coordinateY = -500.0;
            while (coordinateX>57) {
                System.out.println("Введите координату X (Double), значение должно быть не больше 57! Если после ввода вам будет предложен еще один ввод, то ваше предыдущее значение некорректно");


                coordinateX = scan.nextDouble();
            }
            while (coordinateY<-488) {
                System.out.println("Введите координату Y (Double), значение должно быть не меньше -488! Если после ввода вам будет предложен еще один ввод, то ваше предыдущее значение некорректно");
                coordinateY = scan.nextDouble();
            }
            Integer viewScanner =0;
            while ((viewScanner!=1)&&(viewScanner!=2)&&(viewScanner!=3)) {
                System.out.println("Выберите вид из окна(Введите номер варианта):" + "\n" + "1.Парк" + "\n" + "2.улица" + "\n" + "3.Обычный вид" + "\n" +
                        "Если после ввода вам будет предложен еще один ввод, то ваше предыдущее значение некорректно");
                viewScanner = scan.nextInt();
                if (viewScanner == 1) view = View.PARK;
                if (viewScanner == 2) view = View.STREET;
                if (viewScanner == 3) view = View.NORMAL;
            }
            Scanner scan2 = new Scanner(System.in);
            System.out.println("Введите вид дома(Строчный тип)");
            String nameHouseScanner = scan2.nextLine();
            Integer ageHouse = 0;
            while (ageHouse<1) {
                System.out.println("Введите возраст здания (Integer), дому должен быть хотя бы 1 год, если после ввода вам будет предложен еще один ввод, то ваше предыдущее значение некорректно");
                ageHouse = scan2.nextInt();
            }
            Integer numberOfLiftsScanner = 0;
            while (numberOfLiftsScanner<1) {
                System.out.println("Введите количество лифтов в здании (Integer), дом не может быть без лифтов, если после ввода вам будет предложен еще один ввод, то ваше предыдущее значение некорректно");
                numberOfLiftsScanner = scan2.nextInt();
            }
            Flat flat = new Flat(nameScanner, new Coordinates(coordinateX, coordinateY), areaScanner, numberOfRoomsScanner, furnish, view, transport, new House(nameHouseScanner, ageHouse, numberOfLiftsScanner));
            flat.setLogin();
           // CollectionOfFlats.collection.add(flat);
            return flat;
        } catch (InputMismatchException e ){

            System.out.println("Ошибка ввода. Заполните данные для квартиры заново!");
            personCreator();
        } return null;
    }
    public static long g(){
        long idScanner2 = -200;
        int k2 = 0;
        System.out.println("Введите id элемента (тип Long), чтобы обновить его");
        try {


            Scanner scanerr2 = new Scanner(System.in);
            while ((idScanner2<=0)||(idScanner2>1000)) {
                System.out.println("Не хулиганьте! Помните, что id должен быть положительным и не может превышать 1000");
                idScanner2 = scanerr2.nextLong();}

            } catch(InputMismatchException e) {
            System.out.println("Ошибка ввода, повторите");
            g();
        }
        return idScanner2;

    }
    public static Flat changeEleent(long x) throws IOException, AllException {
        long r =x;
        int k2 =0;
        Iterator<Flat> itr = CollectionOfFlats.collection.iterator();
        while(itr.hasNext()){
            Flat flat = itr.next();
            if(flat.id == r){

                k2 = k2+1;
            }
        }
        if (k2==0) System.out.println("Элемента с таким id нет"); else {
            Flat flati = new Flat();
            Furnish furnish = null;
            Transport transport = null;
            View view = null;
            System.out.println("Заполните данные для создания квартиры. Если вы допустите ошибку при вводе, то вам будет предложено создать квартиру заново");
            System.out.println("Введите название квартиры: ");
            try{
                Scanner scan = new Scanner(System.in);
                String nameScanner = scan.nextLine();
                Double areaScanner = 0.0;
                while ((areaScanner<=0.0)||(areaScanner>50000)) {
                    System.out.println("Введите площадь квартиры (Double), если после ввода вам будет предложен еще один ввод площади, то ваше предыдущее значение некорректно ");

                    areaScanner = scan.nextDouble();

                }
                long numberOfRoomsScanner = 0;
                while ((numberOfRoomsScanner<1)||(numberOfRoomsScanner>70)) {
                    System.out.println("Введите количество комнат (Целое число), если после ввода вам будет предложен еще один ввод количества комнат, то ваше предыдущее значение некорректно ");



                    numberOfRoomsScanner = scan.nextInt();
                }
                Integer FurnishScanner = 0;
                while ((FurnishScanner!=1)&&(FurnishScanner!=2)&&(FurnishScanner!=3)&&FurnishScanner!=4) {
                    System.out.println("Выберите отделку(Введите номер варианта):" + "\n" + "1.Дизайнерская" + "\n" + "2.Качественная" + "\n" + "3.Дешевая и плохая" + "\n" + "4.Бетонные стены" +"\n"+
                            "если после ввода вам будет предложен еще один ввод, то ваше предыдущее значение некорректно");


                    FurnishScanner = scan.nextInt();
                    if (FurnishScanner == 1) furnish = Furnish.designer;
                    if (FurnishScanner == 2) furnish = Furnish.fine;
                    if (FurnishScanner == 3) furnish = Furnish.bad;
                    if (FurnishScanner == 4) furnish = Furnish.little;
                }

                Integer transportScanner = 0;
                while ((transportScanner!=1)&&(transportScanner!=2)&&(transportScanner!=3)) {
                    System.out.println("Выберите оживленность траффика за окном(Введите номер варианта):" + "\n" + "1.Машин не много" + "\n" + "2.Траффика вообще нет" + "\n" + "3.Достаточно много автомобилей"+"\n"+
                            "Если после ввода вам будет предложен еще один ввод, то ваше предыдущее значение некорректно");


                    transportScanner = scan.nextInt();
                    if (transportScanner == 1) transport = Transport.FEW;
                    if (transportScanner == 2) transport = Transport.NONE;
                    if (transportScanner == 3) transport = Transport.ENOUGH;
                }
                Double coordinateX = 58.0;
                Double coordinateY = -500.0;
                while (coordinateX>57) {
                    System.out.println("Введите координату X (Double), значение должно быть не больше 57! Если после ввода вам будет предложен еще один ввод, то ваше предыдущее значение некорректно");


                    coordinateX = scan.nextDouble();
                }
                while (coordinateY<-488) {
                    System.out.println("Введите координату Y (Double), значение должно быть не меньше -488! Если после ввода вам будет предложен еще один ввод, то ваше предыдущее значение некорректно");
                    coordinateY = scan.nextDouble();
                }
                Integer viewScanner =0;
                while ((viewScanner!=1)&&(viewScanner!=2)&&(viewScanner!=3)) {
                    System.out.println("Выберите вид из окна(Введите номер варианта):" + "\n" + "1.Парк" + "\n" + "2.улица" + "\n" + "3.Обычный вид" + "\n" +
                            "Если после ввода вам будет предложен еще один ввод, то ваше предыдущее значение некорректно");
                    viewScanner = scan.nextInt();
                    if (viewScanner == 1) view = View.PARK;
                    if (viewScanner == 2) view = View.STREET;
                    if (viewScanner == 3) view = View.NORMAL;
                }
                Scanner scan2 = new Scanner(System.in);
                System.out.println("Введите вид дома(Строчный тип)");
                String nameHouseScanner = scan2.nextLine();
                Integer ageHouse = 0;
                while (ageHouse<1) {
                    System.out.println("Введите возраст здания (Integer), дому должен быть хотя бы 1 год, если после ввода вам будет предложен еще один ввод, то ваше предыдущее значение некорректно");
                    ageHouse = scan2.nextInt();
                }
                Integer numberOfLiftsScanner = 0;
                while (numberOfLiftsScanner<1) {
                    System.out.println("Введите количество лифтов в здании (Integer), дом не может быть без лифтов, если после ввода вам будет предложен еще один ввод, то ваше предыдущее значение некорректно");
                    numberOfLiftsScanner = scan2.nextInt();
                }


                int k = 0;

                Iterator<Flat> itr2 = CollectionOfFlats.collection.iterator();
                while(itr2.hasNext()){
                    Flat flat = itr2.next();
                    if(flat.id == r){
                        flat.setName(nameScanner);
                        flat.setCoordinates(new Coordinates(coordinateX, coordinateY));
                        flat.setArea(areaScanner);
                        flat.setNumberOfRooms(numberOfRoomsScanner);
                        flat.setHouse(new House(nameHouseScanner, ageHouse, numberOfLiftsScanner));
                        flat.setTransport(transport);
                        flat.setView(view);
                        flat.setFurnish(furnish);
                        k = k+1;
                        return flat;
                    }
                }




            } catch (InputMismatchException | AllException e ){

                System.out.println("Ошибка ввода. Заполните данные для квартиры заново!");
                changeEleent(x);
            }
            System.out.println("Значения элемента изменены");
        }return  null;
    }
    public static Flat personCreator1() throws AllException, IOException {
        Furnish furnish = null;
        Transport transport = null;
        View view = null;
        System.out.println("Заполните данные для создания квартиры. Если вы допустите ошибку при вводе, то вам будет предложено создать квартиру заново");
        System.out.println("Введите название квартиры: ");
        try{
            Scanner scan = new Scanner(System.in);
            String nameScanner = scan.nextLine();
            Double areaScanner = 0.0;
            while ((areaScanner<=0.0)||(areaScanner>50000)) {
                System.out.println("Введите площадь квартиры (Double), если после ввода вам будет предложен еще один ввод площади, то ваше предыдущее значение некорректно ");

                areaScanner = scan.nextDouble();

            }
            long numberOfRoomsScanner = 0;
            while ((numberOfRoomsScanner<1)||(numberOfRoomsScanner>70)) {
                System.out.println("Введите количество комнат (Целое число), если после ввода вам будет предложен еще один ввод количества комнат, то ваше предыдущее значение некорректно ");



                numberOfRoomsScanner = scan.nextInt();
            }
            Integer FurnishScanner = 0;
            while ((FurnishScanner!=1)&&(FurnishScanner!=2)&&(FurnishScanner!=3)&&FurnishScanner!=4) {
                System.out.println("Выберите отделку(Введите номер варианта):" + "\n" + "1.Дизайнерская" + "\n" + "2.Качественная" + "\n" + "3.Дешевая и плохая" + "\n" + "4.Бетонные стены" +"\n"+
                        "если после ввода вам будет предложен еще один ввод, то ваше предыдущее значение некорректно");


                FurnishScanner = scan.nextInt();
                if (FurnishScanner == 1) furnish = Furnish.designer;
                if (FurnishScanner == 2) furnish = Furnish.fine;
                if (FurnishScanner == 3) furnish = Furnish.bad;
                if (FurnishScanner == 4) furnish = Furnish.little;
            }

            Integer transportScanner = 0;
            while ((transportScanner!=1)&&(transportScanner!=2)&&(transportScanner!=3)) {
                System.out.println("Выберите оживленность траффика за окном(Введите номер варианта):" + "\n" + "1.Машин не много" + "\n" + "2.Траффика вообще нет" + "\n" + "3.Достаточно много автомобилей"+"\n"+
                        "Если после ввода вам будет предложен еще один ввод, то ваше предыдущее значение некорректно");


                transportScanner = scan.nextInt();
                if (transportScanner == 1) transport = Transport.FEW;
                if (transportScanner == 2) transport = Transport.NONE;
                if (transportScanner == 3) transport = Transport.ENOUGH;
            }
            Double coordinateX = 58.0;
            Double coordinateY = -500.0;
            while (coordinateX>57) {
                System.out.println("Введите координату X (Double), значение должно быть не больше 57! Если после ввода вам будет предложен еще один ввод, то ваше предыдущее значение некорректно");


                coordinateX = scan.nextDouble();
            }
            while (coordinateY<-488) {
                System.out.println("Введите координату Y (Double), значение должно быть не меньше -488! Если после ввода вам будет предложен еще один ввод, то ваше предыдущее значение некорректно");
                coordinateY = scan.nextDouble();
            }
            Integer viewScanner =0;
            while ((viewScanner!=1)&&(viewScanner!=2)&&(viewScanner!=3)) {
                System.out.println("Выберите вид из окна(Введите номер варианта):" + "\n" + "1.Парк" + "\n" + "2.улица" + "\n" + "3.Обычный вид" + "\n" +
                        "Если после ввода вам будет предложен еще один ввод, то ваше предыдущее значение некорректно");
                viewScanner = scan.nextInt();
                if (viewScanner == 1) view = View.PARK;
                if (viewScanner == 2) view = View.STREET;
                if (viewScanner == 3) view = View.NORMAL;
            }
            Scanner scan2 = new Scanner(System.in);
            System.out.println("Введите вид дома(Строчный тип)");
            String nameHouseScanner = scan2.nextLine();
            Integer ageHouse = 0;
            while (ageHouse<1) {
                System.out.println("Введите возраст здания (Integer), дому должен быть хотя бы 1 год, если после ввода вам будет предложен еще один ввод, то ваше предыдущее значение некорректно");
                ageHouse = scan2.nextInt();
            }
            Integer numberOfLiftsScanner = 0;
            while (numberOfLiftsScanner<1) {
                System.out.println("Введите количество лифтов в здании (Integer), дом не может быть без лифтов, если после ввода вам будет предложен еще один ввод, то ваше предыдущее значение некорректно");
                numberOfLiftsScanner = scan2.nextInt();
            }
            Flat flat = new Flat(nameScanner, new Coordinates(coordinateX, coordinateY), areaScanner, numberOfRoomsScanner, furnish, view, transport, new House(nameHouseScanner, ageHouse, numberOfLiftsScanner));
            System.out.println("квартира успешно создана");
            return flat;
        } catch (InputMismatchException e ){

            System.out.println("Ошибка ввода. Заполните данные для квартиры заново!");
            personCreator();
        } return null;
    }

}
