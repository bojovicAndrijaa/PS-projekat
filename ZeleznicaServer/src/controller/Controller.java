/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import domain.DestinacijaVoznje;
import domain.Masinovodja;
import domain.Mesto;
import domain.Voz;
import domain.Voznja;
import domain.VrstaVoza;
import java.util.List;
import repository.Repository;
import repository.db.DbRepository;
import repository.db.impl.RepositoryDBGeneric;
import repository.db.impl.RepositoryDestinacijaVoznje;
import repository.db.impl.RepositoryMasinovodja;
import repository.db.impl.RepositoryMesto;
import repository.db.impl.RepositoryVoz;
import repository.db.impl.RepositoryVoznja;
import repository.db.impl.RepositoryVrstaVoza;

/**
 *
 * @author User
 */
public class Controller {
    
      private final Repository repositoryMasinovodja;
    private final Repository repositoryVoz;
    private final Repository repositoryMesto;
    private final Repository repositoryVoznja;
    private final Repository repositoryVrstaVoza;
    private final Repository repositoryDestinacijaVoznje;
    private final Repository repositoryGeneric;

    private static Controller controller;

    private Controller() {
        this.repositoryGeneric = new RepositoryDBGeneric();
        this.repositoryMasinovodja = new RepositoryMasinovodja();
        this.repositoryVoz = new RepositoryVoz();
        this.repositoryMesto= new RepositoryMesto();
        this.repositoryVoznja= new RepositoryVoznja();
        this.repositoryVrstaVoza = new RepositoryVrstaVoza();
        this.repositoryDestinacijaVoznje = new RepositoryDestinacijaVoznje();
    }

    public static Controller getInstance() {
        if (controller == null) {
            controller = new Controller();
        }
        return controller;
    }

    public List<Masinovodja> ucitajListuMasinovodja() throws Exception {
        return repositoryMasinovodja.getAll();
    }
//
    public void kreirajMasinovodju(Masinovodja masinovodja) throws Exception {
        ((DbRepository) repositoryMasinovodja).connect();
        try {
            repositoryMasinovodja.add(masinovodja);
            ((DbRepository) repositoryMasinovodja).commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            ((DbRepository) repositoryMasinovodja).rollback();
            throw e;
        } finally {
            ((DbRepository) repositoryMasinovodja).disconnect();
        }
    }
//    
    public List<Voz> ucitajListuVozova() throws Exception {
        return repositoryVoz.getAll();
    }
//    
    public void kreirajVoz(Voz voz) throws Exception {
        ((DbRepository) repositoryVoz).connect();
        try {
            repositoryVoz.add(voz);
            ((DbRepository) repositoryVoz).commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            ((DbRepository) repositoryVoz).rollback();
            throw e;
        } finally {
            ((DbRepository) repositoryVoz).disconnect();
        }
    }

      public Voznja kreirajVoznju(Voznja voznja) throws Exception {
        ((DbRepository) repositoryVoznja).connect();
        try {
            repositoryVoznja.add(voznja);
            ((DbRepository) repositoryVoznja).commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            ((DbRepository) repositoryVoznja).rollback();
            throw e;
        } finally {
            ((DbRepository) repositoryVoznja).disconnect();
        }
        return voznja;
    }
    
    public List<Mesto> ucitajListuMesta() throws Exception {
        return repositoryMesto.getAll();
    }
    
    public List<Voznja> ucitajListuVoznji() throws Exception {
        return repositoryVoznja.getAll();
    }
        
    public List<VrstaVoza> ucitajListuVrstiVozova() throws Exception {
        return repositoryVrstaVoza.getAll();
    }
    public List<DestinacijaVoznje> UcitajListuDestinacija() throws Exception {
        return repositoryDestinacijaVoznje.getAll();
    }
    
     public void KreirajDestinaciju(DestinacijaVoznje destinacija) throws Exception {
        ((DbRepository) repositoryDestinacijaVoznje).connect();
        try {
            repositoryDestinacijaVoznje.add(destinacija);
            ((DbRepository) repositoryDestinacijaVoznje).commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            ((DbRepository) repositoryDestinacijaVoznje).rollback();
            throw e;
        } finally {
            ((DbRepository) repositoryDestinacijaVoznje).disconnect();
        }
    }
    
    public void izmeniVoznju(Voznja voznja) throws Exception {
        ((DbRepository) repositoryVoznja).connect();
        try {
            ((DbRepository) repositoryVoznja).edit(voznja);
            ((DbRepository) repositoryVoznja).commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            ((DbRepository) repositoryVoznja).rollback();
            throw e;
        } finally {
            ((DbRepository) repositoryVoznja).disconnect();
        }
    }
    
    
    public void zapamtiMasinovodju(Masinovodja masinovodja) throws Exception {
        ((DbRepository) repositoryMasinovodja).connect();
        try {
            ((DbRepository) repositoryMasinovodja).edit(masinovodja);
            ((DbRepository) repositoryMasinovodja).commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            ((DbRepository) repositoryMasinovodja).rollback();
            throw e;
        } finally {
            ((DbRepository) repositoryMasinovodja).disconnect();
        }
    }
      public void zapamtiVoz(Voz voz) throws Exception {
        ((DbRepository) repositoryVoz).connect();
        try {
            ((DbRepository) repositoryVoz).edit(voz);
            ((DbRepository) repositoryVoz).commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            ((DbRepository) repositoryVoz).rollback();
            throw e;
        } finally {
            ((DbRepository) repositoryVoz).disconnect();
        }
    }
    public List<DestinacijaVoznje> ucitajListuDestinacija () throws Exception {
           return repositoryDestinacijaVoznje.getAll();
    }
    
//    public List<Masinovodja> nadjiMasinovodju(String ime,String prezime) throws Exception{
//        ((DbRepository) repositoryMasinovodja).connect();
//        try {
//            ((DbRepository) repositoryMasinovodja);
//            ((DbRepository) repositoryMasinovodja).commit();
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//            ((DbRepository) repositoryMasinovodja).rollback();
//            throw e;
//        } finally {
//            ((DbRepository) repositoryMasinovodja).disconnect();
//        }
//        return repositoryMasinovodja.
//    }
    
}
