package TP;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MetierproduitImpl implements Imetier<produit,Long>{
    public static void main(String[] args) {


    }

    public List<produit> listP = new ArrayList<>();
    produit Pr2=new produit(06l, "PR1", "marq1", 2635f, "desc1", 10);
    produit Pr3=new produit(05l, "PR2", "marq2", 3000f, "desc2", 2);
    produit Pr4=new produit(07l, "PR3", "marq3", 4000f, "desc3", 4);




    @Override
    public void add(produit o) {

    if (FindBYID(o.getId()) == null)
        listP.add(o);
    else
      System.out.println("existe deja!");

    }

    @Override
    public List<produit> getAll() throws IOException, ClassNotFoundException {
        File file=new File("file2.txt");
        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream in = new ObjectInputStream(fis);

        List<produit> pro= (List) in.readObject();
     /*   System.out.println(pro.get(0).getId()+" "+pro.get(0).getNom()+" "+pro.get(0).getMarque()+" "+pro.get(0).getPrix()+" "+pro.get(0).getDescription()+" "+pro.get(0).getNbstock());
        System.out.println(pro.get(1).getId()+" "+pro.get(1).getNom()+" "+pro.get(1).getMarque()+" "+pro.get(1).getPrix()+" "+pro.get(1).getDescription()+" "+pro.get(1).getNbstock());
        System.out.println(pro.get(2).getId()+" "+pro.get(2).getNom()+" "+pro.get(2).getMarque()+" "+pro.get(2).getPrix()+" "+pro.get(2).getDescription()+" "+pro.get(2).getNbstock());
*/
        in.close();
        fis.close();

        return pro;

    }


    @Override
    public produit FindBYID(Long id) {
        for (produit p:listP){
            if (p.getId()==id)
                return p;
        }

        return null;
    }

    @Override
    public void delete(Long id) {
        produit p1 = FindBYID(id);
        if (p1!=null)
            listP.remove(p1);}


    @Override
    public void saveAll() throws IOException, ClassNotFoundException {

        // Serialization
        try {
            //Saving of object in a file
            File file=new File("file2.txt");
            FileOutputStream fil = new FileOutputStream(file);
            ObjectOutputStream out = new ObjectOutputStream(fil);

            listP.add(Pr2);
            listP.add(Pr3);
            listP.add(Pr4);

            out.writeObject(listP);


            out.close();
            fil.close();

            System.out.println("Object has been serialized");

        } catch (IOException ex) {
            System.out.println("IOException is caught");
        }
    }}

