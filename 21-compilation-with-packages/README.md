# Compilazione e package

## Compilazione ed esecuzione da posizioni arbitrarie di classi contenute in package

1. Si osservi il contenuto della cartella `src`. Si noti come non contenga direttamente sorgenti Java ma una gerarchia di cartelle; all'interno dell'ultima cartella è presente un file sorgente.
2. Si visualizzi il contenuto del file sorgente (ad es. con `cat`/`head` in Unix o `type` in Windows) e si noti come il package della classe corrisponda alla struttura delle directory che contengono il file sorgente
    - **Nota**: è buona norma organizzare i sorgenti in modo che la loro struttura sul file system replichi la struttura dei package. Si noti però che, **poiché il compilatore lavora su file**, tale scelta non è strettamente obbligatoria
3. Si posizioni il terminale in modo che punti alla cartella che *contiene* `src`;
ovvero, la cartella in cui il comando `ls` (o `dir` in ambiente Windows)
restituisce, fra i contenuti, anche `src`.
4. Si esegua la compilazione del file `ComplexNum.java` all'interno di una nuova cartella `bin/`
5. Si faccia una previsione circa il contenuto di `bin` (in termini di quali cartelle e quali file vi saranno all'interno)
6. Si verifichi la propria previsione.
7. Si esegua la classe usando il comando: `java -cp bin ComplexNum`
    - Oh-oh... errore. Perché? Si provi a comprenderne la ragione e a correggere il comando.
8. Si punti il terminale in `bin/compilation/lab/math/`
9. Si provi ad eseguire la classe usando il comando: `java ComplexNum`
    - Oh-oh... errore. Perché? Eppure il file `ComplexNum.class` è proprio lì. Si provi a comprenderne la ragione e a correggere il comando.

cat .\src\compilation\lab\math\ComplexNum.java
javac -d bin src\compilation\lab\math\ComplexNum.java
dir bin
java -cp bin compilation.lab.math.ComplexNum
java -cp ..\..\..\ compilation.lab.math.ComplexNum