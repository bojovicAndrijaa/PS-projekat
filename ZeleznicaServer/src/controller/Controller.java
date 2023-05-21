/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import domain.Masinovodja;
import domain.Mesto;
import domain.Voz;
import domain.Voznja;
import domain.VrstaVoza;
import java.util.List;
import repository.Repository;
import repository.db.DbRepository;
import repository.db.impl.RepositoryDBGeneric;
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
   
    private final Repository repositoryGeneric;

    private static Controller controller;

    private Controller() {
        this.repositoryGeneric = new RepositoryDBGeneric();
        this.repositoryMasinovodja = new RepositoryMasinovodja();
        this.repositoryVoz = new RepositoryVoz();
        this.repositoryMesto= new RepositoryMesto();
        this.repositoryVoznja= new RepositoryVoznja();
        this.repositoryVrstaVoza = new RepositoryVrstaVoza();
 
    }

    public static Controller getInstance() {
        if (controller == null) {
            controller = new Controller();
        }
        return controller;
    }

    public List<Masinovodja> UcitajListuMasinovodja() throws Exception {
        return repositoryMasinovodja.getAll();
    }
//
    public void KreirajMasinovodju(Masinovodja masinovodja) throws Exception {
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
    public List<Voz> UcitajListuVozova() throws Exception {
        return repositoryVoz.getAll();
    }
//    
    public void KreirajVoz(Voz voz) throws Exception {
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

      public void KreirajVoznju(Voznja voznja) throws Exception {
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
    }
    
    public List<Mesto> UcitajListuMesta() throws Exception {
        return repositoryMesto.getAll();
    }
    
    public List<Voznja> UcitajListuVoznji() throws Exception {
        return repositoryVoznja.getAll();
    }
        
    public List<VrstaVoza> UcitajListuVrstiVozova() throws Exception {
        return repositoryVrstaVoza.getAll();
    }

    public void IzmeniPodatkeVoza(Voz voz) throws Exception {
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
    
    public void IzmeniVoznju(Voznja voznja) throws Exception {
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
    
    
    public void IzmeniPodatkeMasinovodje(Masinovodja masinovodja) throws Exception {
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
    
}
