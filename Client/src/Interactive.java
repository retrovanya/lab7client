import Auth.InterScanner;
import PersonData.*;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
public class Interactive {
   /* ArrayList t =new ArrayList();
    int k =0;
    int yuy =0;
    Flat methodFlat = new Flat();
    HelpMenu1 helpMenu1 = new HelpMenu1();
    CollectionOfFlats col = new CollectionOfFlats();
    public Interactive() throws IOException, AllException, AllException {
    }

    ArrayList<String> historyCom= new ArrayList<String>();
    public void ScanInteractive() throws IOException, AllException {
        System.out.println("Введите команду. Для просмотра возможных команд введите help");
        Scanner scanInteractive = new Scanner(System.in);
        String userCommand = "";
        String[] finalUserCommand;

        while (!userCommand.equals("exit") ) {
            userCommand = scanInteractive.nextLine();
            userCommand = userCommand.trim();
            finalUserCommand = userCommand.trim().split(" ", 2);


            switch (finalUserCommand[0]) {
                case"help":
                    helpMenu1.InfoMenu1();
                    historyCom.add(userCommand);
                    k = k+1;
                    break;
                case"info":
                   col.InfoCollection();
                    historyCom.add(userCommand);
                    k = k+1;
                    break;
                case"clear":
                    CollectionOfFlats.collection.clear();
                    System.out.println("Все элементы коллекции удалены");
                    historyCom.add(userCommand);
                    k = k+1;
                    break;
                case"show":
                    System.out.println(CollectionOfFlats.collection);
                    historyCom.add(userCommand);
                    k = k+1;
                    break;
                case"add":
                    int t = CollectionOfFlats.collection.size();
                    InterScanner.personCreator();
                    if (CollectionOfFlats.collection.size()!=t)
                        System.out.println("Квартира успешно добавлена в коллекцию.");
                    historyCom.add(userCommand);
                    k = k+1;
                    break;
                case "removeById":
                    methodFlat.removeById();
                    historyCom.add(userCommand);
                    k = k+1;
                    break;
                case "save":
                    methodFlat.FileSaving();
                    historyCom.add(userCommand);
                    k = k+1;
                    break;

                case "countByRooms":
                    methodFlat.countByRooms();
                    historyCom.add(userCommand);
                    k = k+1;
                    break;
                case "removeByHouseAge":
                    methodFlat.removeByHouseAge();
                    historyCom.add(userCommand);
                    k = k+1;
                    break;
                case "showByName":
                    methodFlat.stringFishing();
                    historyCom.add(userCommand);
                    k = k+1;
                    break;
                case "removeGreater":
                    methodFlat.compare();
                    historyCom.add(userCommand);
                    k = k+1;
                    break;
                case "removeLower":
                    methodFlat.compare2();
                    historyCom.add(userCommand);
                    k = k+1;
                    break;
                case "script":
                    hy();
                    yuy =yuy+1;
                    historyCom.add(userCommand);
                    k = k+1;
                    break;
                case "history":
                    System.out.println("Последние команды:");
                    historyCom.add(userCommand);
                    k = k+1;
                    yyy();
                    break;

                case"exit":
            }
        }

    }
    public  void yyy(){
        if (k>0){
            System.out.println(historyCom);
        }

    } public void ScriptReading() throws IOException, AllException {
        Scanner scanInteractive = new Scanner(System.in);
        String userCommand = "";
        String[] finalUserCommand;
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("Введите имя файла со скриптом");
            String kk = scan.nextLine();
            FileReader fr = new FileReader(kk);
            Scanner scanCloser = new Scanner(fr);


            while (scanCloser.hasNextLine()) {

                userCommand = scanCloser.nextLine();
                //userCommand = userCommand.trim();
                finalUserCommand = userCommand.trim().split(" ", 2);


                switch (finalUserCommand[0]) {
                    case"help":
                        helpMenu1.InfoMenu1();
                        historyCom.add(userCommand);
                        k = k+1;
                        break;
                    case"info":
                        col.InfoCollection();
                        historyCom.add(userCommand);
                        k = k+1;
                        break;
                    case"clear":
                        CollectionOfFlats.collection.clear();
                        System.out.println("Все элементы коллекции удалены");
                        historyCom.add(userCommand);
                        k = k+1;
                        break;
                    case"show":
                        System.out.println(CollectionOfFlats.collection);
                        historyCom.add(userCommand);
                        k = k+1;
                        break;
                    case"add":
                        int t = CollectionOfFlats.collection.size();
                        Flat fl =new Flat();
                        fl.setName(scanCloser.nextLine());
                        Double num = Double.parseDouble(scanCloser.nextLine());
                        Double num2 = Double.parseDouble(scanCloser.nextLine());
                        fl.setCoordinates(new Coordinates(num, num2));
                        Double num3 = Double.parseDouble(scanCloser.nextLine());
                        fl.setArea(num3);
                        Long num4 = Long.parseLong(scanCloser.nextLine());
                        fl.setNumberOfRooms(num4);
                        String fur = scanCloser.nextLine();
                        if (fur.equals("Furnish.designer"))
                            fl.setFurnish(Furnish.designer);
                        if (fur.equals("Furnish.little"))
                            fl.setFurnish(Furnish.little);
                        if (fur.equals("Furnish.fine"))
                            fl.setFurnish(Furnish.fine);
                        if (fur.equals("Furnish.bad"))
                            fl.setFurnish(Furnish.bad);
                        String viewww = scanCloser.nextLine();
                        if (viewww.equals("View.PARK"))
                            fl.setView(View.PARK);
                        if (viewww.equals("View.STREET"))
                            fl.setView(View.STREET);
                        if (viewww.equals("View.NORMAL"))
                            fl.setView(View.NORMAL);
                        String transp = scanCloser.nextLine();
                        if (transp.equals("Transport.Few"))
                            fl.setTransport(Transport.FEW);
                        if (transp.equals("Transport.Enough"))
                            fl.setTransport(Transport.ENOUGH);
                        if (transp.equals("Transport.None"))
                            fl.setTransport(Transport.NONE);
                        House house11 =new House();
                        house11.name = scanCloser.nextLine();
                        Integer num5 = Integer.parseInt(scanCloser.nextLine());
                        Integer num6 = Integer.parseInt(scanCloser.nextLine());
                        house11.year =num5;
                        house11.numberOfLifts =num6;
                        fl.setHouse(house11);
                        fl.setId(methodFlat.randomId());
                        CollectionOfFlats.collection.add(fl);
                        if (CollectionOfFlats.collection.size()!=t)
                            System.out.println("Квартира успешно добавлена в коллекцию.");
                        historyCom.add(userCommand);
                        k = k+1;
                        break;
                    case "removeById":
                        removeByIdScript(scanCloser.nextLine());
                        historyCom.add(userCommand);
                        k = k+1;
                        break;
                    case "save":
                        methodFlat.FileSaving();
                        historyCom.add(userCommand);
                        k = k+1;
                        break;
                    case"updateId":
                        updateIdScript(scanCloser.nextLine());
                        historyCom.add(userCommand);
                        k = k+1;
                        break;
                    case "countByRooms":
                        countByRoomsScript(scanCloser.nextLine());
                        historyCom.add(userCommand);
                        k = k+1;
                        break;
                    case "removeByHouseAge":
                        removeByHouseAgeScript(scanCloser.nextLine());
                        historyCom.add(userCommand);
                        k = k+1;
                        break;
                    case "showByName":
                        stringFishingScript(scanCloser.nextLine());
                        historyCom.add(userCommand);
                        k = k+1;
                        break;
                    case "removeGreater":
                        compareScript(scanCloser.nextLine());
                        historyCom.add(userCommand);
                        k = k+1;
                        break;
                    case "removeLower":
                        methodFlat.compare2();
                        historyCom.add(userCommand);
                        k = k+1;
                        break;
                    case "history":
                        System.out.println("Последние команды:");
                        historyCom.add(userCommand);

                        k = k+1;
                        yyy();
                    case "script":
                        ScriptReading();

                    case"exit":
                        System.exit(0);
                }


            }
            fr.close();
        } catch (FileNotFoundException e) {
            System.out.println("Вы ошиблись в имени файла.");
            ScriptReading();
        }}
    public void removeByIdScript(String str) {
        long idScanner = -20000;
        int k = 0;
        Long numID = Long.parseLong(str);
        idScanner = numID;

        Iterator<Flat> itr = CollectionOfFlats.collection.iterator();
        while(itr.hasNext()){
            Flat flat = itr.next();
            if(flat.id == idScanner){
                CollectionOfFlats.collection.remove(flat);
                System.out.println("Элемент коллекции был успешно удален.");
                k = k+1;
            } }
        if (k == 0){
            System.out.println("Элемента с введенным вами id в коллекции нет.");
        }
    }
    public void updateIdScript(String str)  {
        long idScanner = -200;
        int k = 0;
        Long numID = Long.parseLong(str);


        idScanner = numID;
        Iterator<Flat> itr = CollectionOfFlats.collection.iterator();
        while(itr.hasNext()){
            Flat flat = itr.next();
            if(flat.id == idScanner){
                flat.id = methodFlat.randomId();
                System.out.println("id элемента был успешно обновлен.");
                k = k+1;
            }
        }
        if (k == 0){
            System.out.println("Элемента с введенным вами id в коллекции нет.");
        }
    }
    public void countByRoomsScript(String str)  {
        long roomsScanner = -30;
        int k = 0;
        long r =0;
        Long numRooms = Long.parseLong(str);



        roomsScanner = numRooms;
        Iterator<Flat> itr = CollectionOfFlats.collection.iterator();
        while(itr.hasNext()){
            Flat flat = itr.next();
            if(flat.getNumberOfRooms() == roomsScanner){
                r = k+1;
                k = k+1;
            }
        }
        if (k == 0)
            System.out.println("Элемента с введенным вами количеством комнат в коллекции нет.");
        else System.out.println("В коллекции есть "+ r + " квартир, в которых число комнат равно " + roomsScanner);
    }
    public void removeByHouseAgeScript(String str){
        Integer idScanner = -10;
        int k = 0;
        Integer numRooms = Integer.parseInt(str);



        idScanner = numRooms;
        Iterator<Flat> itr2 = CollectionOfFlats.collection.iterator();
        while (itr2.hasNext()) {
            Flat flat = itr2.next();
            if (flat.getHouse().year == idScanner) {
                itr2.remove();
                k = k + 1;
            }
        }
        if(k!=0) System.out.println("Элементы коллекции были успешно удалены.");
        else System.out.println("Элементов с введенным возрастом дома нет");
    }
    public void stringFishingScript(String str){
        String nameScanner = "hh" ;
        int k = 0;





        nameScanner = str;

        Iterator<Flat> itr2 = CollectionOfFlats.collection.iterator();
        while (itr2.hasNext()) {
            Flat flat = itr2.next();
            String s = flat.getName();
            String n = s.substring(0, 5);
            if (n.equals(nameScanner)) {
                System.out.println(flat);
                k=k+1;
            }
        }
        if (k == 0) System.out.println("В коллекции нет элемента, имя которого начинается с введенной вами строки или введенная вами строка содержит меньше 5 символов");
    }
    public void compareScript(String str)  {
        long idScanner = -10;
        Long numID = Long.parseLong(str);
        int k = 0;
        int t = CollectionOfFlats.collection.size();
        int t1 = CollectionOfFlats.collection.size();




        idScanner = numID;
        Iterator<Flat> itr = CollectionOfFlats.collection.iterator();
        while(itr.hasNext()){
            Flat flat = itr.next();
            if(flat.id == idScanner){
                k = k+1;
            }
        }
        if (k>0) {
            Iterator<Flat> itr1 = CollectionOfFlats.collection.iterator();
            while(itr1.hasNext()){
                Flat flat2 = itr1.next();
                if(flat2.id > idScanner){
                    itr1.remove();
                    t= t-1;
                }
            }
            if (t1!=t) System.out.println("Коллекция была обновлена."); else System.out.println("В коллекции нет элемента, превышающего введенный вами.");
        }
        else System.out.println("В коллекции нет элемента с таким id.");

    }
    public void compare2Script(String str)  {
        long idScanner = -10;
        int k = 0;
        Long numID = Long.parseLong(str);
        int t = CollectionOfFlats.collection.size();
        int t1 = CollectionOfFlats.collection.size();



        idScanner = numID;
        Iterator<Flat> itr = CollectionOfFlats.collection.iterator();
        while (itr.hasNext()) {
            Flat flat = itr.next();
            if (flat.id == idScanner) {
                k = k + 1;
            }
        }
        if (k > 0) {
            Iterator<Flat> itr1 = CollectionOfFlats.collection.iterator();
            while (itr1.hasNext()) {
                Flat flat2 = itr1.next();
                if (flat2.id < idScanner) {
                    itr1.remove();
                    t = t - 1;
                }
            }
            if (t1 != t) System.out.println("Коллекция была обновлена.");
            else System.out.println("В коллекции нет элемента, который меньше введенного вами.");
        } else System.out.println("В коллекции нет элемента с таким id.");
    }
    public static String getFilePath1(){
        String path = System.getenv("duo");
        System.out.println(System.getProperty("user.dir"));
        if (path == null){
            return ("----\nПуть через переменную окружения uno не указан\n----");
        } else {
            return path;
        }
    }
    public  void hy() {
        Scanner scanner = null;
        try {
            getFilePath1();
            if (getFilePath1()==null)
                System.out.println("----\nПуть не указан, дальнейшая работа не возможна.\n----");
            else {
                Scanner scanInteractive = new Scanner(System.in);
                String userCommand = "";
                String[] finalUserCommand;


                FileReader fr = new FileReader("scriptFile.TXT");
                Scanner scanCloser = new Scanner(fr);


                while ((scanCloser.hasNextLine()) &&(yuy<5)) {

                    userCommand = scanCloser.nextLine();
                    //userCommand = userCommand.trim();
                    finalUserCommand = userCommand.trim().split(" ", 2);


                    switch (finalUserCommand[0]) {
                        case"help":
                            helpMenu1.InfoMenu1();
                            historyCom.add(userCommand);
                            k = k+1;
                            break;
                        case"info":
                            col.InfoCollection();
                            historyCom.add(userCommand);
                            k = k+1;
                            break;
                        case"clear":
                            CollectionOfFlats.collection.clear();
                            System.out.println("Все элементы коллекции удалены");
                            historyCom.add(userCommand);
                            k = k+1;
                            break;
                        case"show":
                            System.out.println(CollectionOfFlats.collection);
                            historyCom.add(userCommand);
                            k = k+1;
                            break;
                        case"add":
                            int t = CollectionOfFlats.collection.size();
                            Flat fl =new Flat();
                            fl.setName(scanCloser.nextLine());
                            Double num = Double.parseDouble(scanCloser.nextLine());
                            Double num2 = Double.parseDouble(scanCloser.nextLine());
                            fl.setCoordinates(new Coordinates(num, num2));
                            Double num3 = Double.parseDouble(scanCloser.nextLine());
                            fl.setArea(num3);
                            Long num4 = Long.parseLong(scanCloser.nextLine());
                            fl.setNumberOfRooms(num4);
                            String fur = scanCloser.nextLine();
                            if (fur.equals("Furnish.designer"))
                                fl.setFurnish(Furnish.designer);
                            if (fur.equals("Furnish.little"))
                                fl.setFurnish(Furnish.little);
                            if (fur.equals("Furnish.fine"))
                                fl.setFurnish(Furnish.fine);
                            if (fur.equals("Furnish.bad"))
                                fl.setFurnish(Furnish.bad);
                            String viewww = scanCloser.nextLine();
                            if (viewww.equals("View.PARK"))
                                fl.setView(View.PARK);
                            if (viewww.equals("View.STREET"))
                                fl.setView(View.STREET);
                            if (viewww.equals("View.NORMAL"))
                                fl.setView(View.NORMAL);
                            String transp = scanCloser.nextLine();
                            if (transp.equals("Transport.Few"))
                                fl.setTransport(Transport.FEW);
                            if (transp.equals("Transport.Enough"))
                                fl.setTransport(Transport.ENOUGH);
                            if (transp.equals("Transport.None"))
                                fl.setTransport(Transport.NONE);
                            House house11 =new House();
                            house11.name = scanCloser.nextLine();
                            Integer num5 = Integer.parseInt(scanCloser.nextLine());
                            Integer num6 = Integer.parseInt(scanCloser.nextLine());
                            house11.year =num5;
                            house11.numberOfLifts =num6;
                            fl.setHouse(house11);
                            fl.setId(methodFlat.randomId());
                            CollectionOfFlats.collection.add(fl);
                            if (CollectionOfFlats.collection.size()!=t)
                                System.out.println("Квартира успешно добавлена в коллекцию.");
                            historyCom.add(userCommand);
                            k = k+1;
                            break;
                        case "removeById":
                            removeByIdScript(scanCloser.nextLine());
                            historyCom.add(userCommand);
                            k = k+1;
                            break;
                        case "save":
                            methodFlat.FileSaving();
                            historyCom.add(userCommand);
                            k = k+1;
                            break;
                        case"updateId":
                            updateIdScript(scanCloser.nextLine());
                            historyCom.add(userCommand);
                            k = k+1;
                            break;
                        case "countByRooms":
                            countByRoomsScript(scanCloser.nextLine());
                            historyCom.add(userCommand);
                            k = k+1;
                            break;
                        case "removeByHouseAge":
                            removeByHouseAgeScript(scanCloser.nextLine());
                            historyCom.add(userCommand);
                            k = k+1;
                            break;
                        case "showByName":
                            stringFishingScript(scanCloser.nextLine());
                            historyCom.add(userCommand);
                            k = k+1;
                            break;
                        case "removeGreater":
                            compareScript(scanCloser.nextLine());
                            historyCom.add(userCommand);
                            k = k+1;
                            break;
                        case "removeLower":
                            methodFlat.compare2();
                            historyCom.add(userCommand);
                            k = k+1;
                            break;
                        case "history":
                            System.out.println("Последние команды:");
                            historyCom.add(userCommand);
                            k = k+1;
                            yyy();
                            break;
                        case "script":
                            yuy =yuy+1;
                            hy();
                            break;
                        case"exit":
                            System.exit(0);
                    }


                }
                fr.close();
            } } catch (IOException e) {
            e.printStackTrace();
        } catch (AllException e) {
            e.printStackTrace();
        }

    }*/

}
