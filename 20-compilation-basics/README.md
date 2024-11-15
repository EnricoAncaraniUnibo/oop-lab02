# Organizzazione di codice sorgente e bytecode

#### FASE 1 - Compilazione in percorsi arbitrari

1. Si osservi la struttura del progetto: la cartella `src` contiene il sorgente.
2. Si crei una nuova cartella `bin`
    - In Unix: usare il comando `mkdir`
    - In Windows: usare il comando `md`
    - non usare il file manager!
3. Si esegua la compilazione indicando `bin` come destinazione dell'output di compilazione
    - In Unix: `javac -d bin src/Calculator.java`
    - In Windows: `javac -d bin src\Calculator.java`
    - si noti il diverso separatore di percorso
4. Si verifichi la presenza di `Calculator.class` all'interno di `bin`
    - In Unix: `ls bin`
    - In Windows: `dir bin`
5. Si sposti il terminale dentro `bin` (comando `cd`)
6. Si esegua la classe `Calculator`

#### FASE 2 - Esecuzione con classpath esplicito

1. Si posizioni il terminale nella cartella che contiene `src` e `bin`
2. Da quella posizione, si esegua la classe `Calculator` usando opportunamente l'opzione `-cp` (si faccia riferimento alle slide del laboratorio)
3. Si posizioni il terminale nella root del file system
    - In Unix, `/`
    - In Windows, `C:\` (o altra lettera di unità se il file non è stato scompattato in `C:`
4. Senza cambiare la posizione del terminale, si esegua nuovamente `Calculator`

mkdir bin
javac -d bin src\Calculator.java
dir bin
cd bin
java Calculator

cd ..
java -cp bin Calculator
cd .. tante volte
java -cp .\Users\enrico.ancarani\Desktop\oop-lab02\20-compilation-basics\bin\ Calculator