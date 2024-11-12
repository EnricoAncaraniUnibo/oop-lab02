package it.unibo.constructors;

class UseConstructors {

    public static void main(final String[] args) {
        // NB: Per verificare la correttezza dei costruttori implementati
        // stampare a video le informazioni relative agli studenti (metodo
        // printStudentInfo) e ai treni (a tal fine implementare un metodo
        // printTrainInfo nella classe Train).

        // 1) Creare lo studente Mario Rossi, matricola 1014, anno
        // immatricolazione 2013
        Student s1=new Student("Mario","Rossi",1014,2013);
        s1.printStudentInfo();
        // 2) Creare lo studente Luca Bianchi, matricola 1018, anno
        // immatricolazione 2010
        Student s2=new Student("Luca", "bianchi", 1018, 2010);
        s2.printStudentInfo();
        // 3) Creare lo studente Peppino Vitiello, matricola 1019, anno
        // immatricolazione 2012
        Student s3=new Student("Peppino", "vitiello", 1019, 2012);
        s3.printStudentInfo();
        // 4) Creare lo studente Luca Verdi, matricola 1020, anno
        // immatricolazione 2013
        Student s4=new Student("Luca","verdi", 1012, 2013);
        s4.printStudentInfo();
        // 5) Creare un treno con 300 posti di cui 100 in prima classe 200 in
        // seconda classe
        Train s5=new Train(300, 100, 200);
        s5.printTrainInfo();
        // 6) Creare un treno con 1200 posti di cui 50 in prima classe 1050 in
        // seconda classe
        Train s6=new Train(1200, 50, 1050);
        s6.printTrainInfo();
        // 7) Creare un treno con 500 posti, tutti di seconda classe
        Train s7=new Train(500, 0, 500);
        s7.printTrainInfo();
        // 8) Creare un treno con numero di posti di default
        Train s8=new Train();
        s8.printTrainInfo();
        // 9) Verificare che il numero di posti
        // di default sia consistente (ossia che ci sia un numero positivo di
        // posti totali, e che la somma dei posti in prima e seconda classe dia
        // il totale dei posti sul treno).
        if((s8.firstClassSeats+s8.secondClassSeats)==s8.seats)
        {
            System.out.println("Sono consistenti");
        }
    }
}
