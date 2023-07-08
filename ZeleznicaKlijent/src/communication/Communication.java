package communication;

import domain.Voz;
import domain.DestinacijaVoznje;
import domain.Voznja;
import domain.Mesto;
import domain.Masinovodja;
import domain.VrstaVoza;
import java.net.Socket;
import java.util.List;

/**
 *
 * @author Cartman
 */
public class Communication {
    Socket socket;
    Sender sender;
    Receiver receiver;
    
    private static Communication instance;
    private Communication() throws Exception{
        socket=new Socket("127.0.0.1", 9001);
        sender=new Sender(socket);
        receiver=new Receiver(socket);
    }
    public static Communication getInstance() throws Exception{
        if(instance == null){
            instance = new Communication();
        }
        return instance;
    }
    
   
    
    public void kreirajVoz(Voz voz) throws Exception {
        Request request=new Request(Operation.KreirajVoz, voz);
        sender.send(request);
        Response response=(Response)receiver.receive();
        if(response.getException()==null){

        }else{
            throw response.getException();
        }
    }
    public void zapamtiVoz(Voz voz) throws Exception {
        Request request=new Request(Operation.ZapamtiVoz, voz);
        sender.send(request);
        Response response=(Response)receiver.receive();
        if(response.getException()==null){
            
        }else{
            throw response.getException();
        }
    }
    public List<Voz> ucitajListuVozova() throws Exception{
        Request request=new Request(Operation.UcitajListuVozova, null);
        sender.send(request);
        Response response=(Response)receiver.receive();
        if(response.getException()==null){
            return (List<Voz>)response.getResult();
        }else{
            throw response.getException();
        }
    }
    public List<Voz> nadjiVoz(Long vozID) throws Exception{
        Request request=new Request(Operation.NadjiVoz, null);
        sender.send(request);
        Response response=(Response)receiver.receive();
        if(response.getException()==null){
            return (List<Voz>)response.getResult();
        }else{
            throw response.getException();
        }
    }
 

    public List<Mesto> ucitajListuMesta() throws Exception{
        Request request=new Request(Operation.UcitajListuMesta, null);
        sender.send(request);
        Response response=(Response)receiver.receive();
        if(response.getException()==null){
            return (List<Mesto>)response.getResult();
        }else{
            throw response.getException();
        }
    }
     public void kreirajMasinovodju(Masinovodja masinovodja) throws Exception {
        Request request=new Request(Operation.KreirajMasinovodju, masinovodja);
        sender.send(request);
        Response response=(Response)receiver.receive();
        if(response.getException()==null){
            
        }else{
            throw response.getException();
        }
    }
    public void zapamtiMasinovodju(Masinovodja masinovodja) throws Exception {
        Request request=new Request(Operation.ZapamtiMasinovodju, masinovodja);
        sender.send(request);
        Response response=(Response)receiver.receive();
        if(response.getException()==null){
            
        }else{
            throw response.getException();
        }
    }
    public List<Masinovodja> nadjiMasinovodju(Long masinovodjaID) throws Exception{
        Request request=new Request(Operation.NadjiMasinovodju, null);
        sender.send(request);
        Response response=(Response)receiver.receive();
        if(response.getException()==null){
            return (List<Masinovodja>)response.getResult();
        }else{
            throw response.getException();
        }
    }
    public List<Masinovodja> ucitajListuMasinovodja() throws Exception{
        Request request=new Request(Operation.UcitajListuMasinovodja, null);
        sender.send(request);
        Response response=(Response)receiver.receive();
        if(response.getException()==null){
            return (List<Masinovodja>)response.getResult();
        }else{
            System.out.println("communication.Communication.ucitajListuMasinovodja()");
            throw response.getException();
        }
    }
     public Voznja kreirajVoznju(Voznja voznja) throws Exception {
        Request request=new Request(Operation.KreirajVoznju, voznja);
        sender.send(request);
        Response response=(Response)receiver.receive();
        if(response.getException()==null){
           return (Voznja)response.getResult();
        }else{
            System.out.println("communication.Communication.kreirajVoznju()");
            throw response.getException();
        }
    }
     public void zapamtiVoznju(Voznja voznja) throws Exception {
        Request request=new Request(Operation.ZapamtiVoznju, voznja);
        sender.send(request);
        Response response=(Response)receiver.receive();
        if(response.getException()==null){
            
        }else{
            throw response.getException();
        }
    }
    public List<Voznja> nadjiVoznju(String  mesto) throws Exception{
        Request request=new Request(Operation.NadjiVoznju, mesto);
        sender.send(request);
        Response response=(Response)receiver.receive();
        if(response.getException()==null){
            return (List<Voznja>)response.getResult();
        }else{
            throw response.getException();
        }
    }
    public List<Voznja> ucitajListuVoznji() throws Exception{
        Request request=new Request(Operation.UcitajListuVoznji, null);
        sender.send(request);
        Response response=(Response)receiver.receive();
        if(response.getException()==null){
            return (List<Voznja>)response.getResult();
        }else{
            throw response.getException();
        }
    }
//    public Mesto getMestoZaZadatuVoznju(Voznja voznja) throws Exception{
//        Request request=new Request(Operation.GetMestoZaZadatuVoznju, voznja);
//        sender.send(request);
//        Response response=(Response)receiver.receive();
//        if(response.getException()==null){
//            return (Mesto)response.getResult();
//        }else{
//            throw response.getException();
//        }
//    }
    public void kreirajDestinacijuVoznje(DestinacijaVoznje destinacija) throws Exception {
        Request request=new Request(Operation.KreirajDestinacijuVoznje, destinacija);
        sender.send(request);
        Response response=(Response)receiver.receive();
        if(response.getException()==null){
            
        }else{
            throw response.getException();
        }
    }
    public List<VrstaVoza> UcitajListuVrstiVozova() throws Exception{
        Request request=new Request(Operation.UcitajListuVrstaVozova, null);
        sender.send(request);
        Response response=(Response)receiver.receive();
        if(response.getException()==null){
            return (List<VrstaVoza>)response.getResult();
        }else{
            System.out.println("communication.Communication.ucitajListuVrstaVozova()");
            throw response.getException();
        }
    }
    
    

   
    
    
    
}
