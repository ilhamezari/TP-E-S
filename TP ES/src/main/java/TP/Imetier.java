package TP;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public interface Imetier<T,U> {
          void add (T o);

   public List<T> getAll() throws IOException, ClassNotFoundException;
  public  T FindBYID(U id);
          void delete (U id);

          void saveAll() throws IOException, ClassNotFoundException;




}




