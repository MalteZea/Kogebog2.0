package sample;

import java.io.*;
import java.util.ArrayList;

public class Persistens {

    public ArrayList<Opskrift> load() throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("t.tmp");
        ObjectInputStream ois = new ObjectInputStream(fis);
        ArrayList<Opskrift> opskrifter = (ArrayList<Opskrift>) ois.readObject();
        ois.close();
        return opskrifter;
    }

    public void save(ArrayList<Opskrift> opskrifter) throws IOException {
        FileOutputStream fos = new FileOutputStream("t.tmp");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(opskrifter);
        oos.close();
    }
}
