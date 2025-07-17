import java.util.*;

public class CollectionsBeispiele {
    public static void main(String[] args) {

        // ===============================
        // 1. LISTEN (ArrayList)
        // ===============================
        System.out.println("ArrayList");
        // Erstellen einer ArrayList und Hinzufügen von Elementen
        ArrayList<String> autoListe = new ArrayList<>();
        autoListe.add("BMW");
        autoListe.add("Audi");
        autoListe.add("Ford");

        autoListe.add(2,"Ford");

        // Ausgabe der Liste
        System.out.println("Inhalt der ArrayList: " + autoListe); // [BMW, Audi, Ford]

        // Zugriff auf das erste Element
        System.out.println("Erste Element: " + autoListe.get(0)); // BMW
        // alternative zum zugriff auf den ersten Element
        // System.out.println("Erste Element: " + autoListe.getFirst()); // BMW

        // Größe der Liste
        System.out.println("Größe der Liste: " + autoListe.size()); // 3

        // Entfernen eines elements
        autoListe.remove("Audi");
        autoListe.remove(2);

        System.out.println("Inhalt der ArrayList nach Entfernen von audi: " + autoListe);

        // erstelle einer Liste von Intergers
        ArrayList<Integer> intListe = new ArrayList<>();
        intListe.add(100);
        Integer k = 120;

        intListe.add(k);

        System.out.println(intListe);

        // intListe über for-Schleife befüllen:
        for (int i = 0; i < 5; i++){
            intListe.add(i);
        };

        System.out.println(intListe);

        // Entfernen von Elementen aus ler Liste
        intListe.remove(2);
        System.out.println(intListe);

        intListe.remove(k);
        System.out.println(intListe);

        intListe.remove(Integer.valueOf(4));
        System.out.println(intListe);

        // Element in der Liste mit .addall hinzufügen
        Collections.addAll(intListe,10,5,6,7,8,9);
        System.out.println("Ursprüngliche Liste: " + intListe);

        // sortieren (Aufsteigende Sortierung)
        Collections.sort(intListe);
        System.out.println("Aufsteigend sortierte Liste: " + intListe);

        // Absteigend Sortieren
        Collections.sort(intListe, Comparator.reverseOrder());
        System.out.println("Absteigend sortierte Liste: " + intListe);

        // Mischen der Liste
        Collections.shuffle(intListe);
        System.out.println("Gemischte Liste: " + intListe);

        // max() und min(): Finden das größte bzw. das kleinste Element in einer Liste.
        System.out.println("Größtes Element: "+ Collections.max(intListe));
        System.out.println("Kleinßtes Element: "+ Collections.min(intListe));

        // ===============================
        // 2. MENGEN (HashSet)
        // ===============================
        System.out.println("HASHSET");
        System.out.println("=====================");

        // Erstellen eines HashSet und Hinzufügen von Elementen
        HashSet<String> autoSet = new HashSet<>();
        autoSet.add("BMW");
        autoSet.add("Audi");
        autoSet.add("Ford");
        autoSet.add("Ford");// Duplikat, wird nicht hinzugefügt
        // Ausgabe des Sets
        System.out.println("Inhalt des HashSet: " + autoSet);//[Audi, Ford, BMW]
        System.out.println(autoSet.add("Hyundai"));//true
        System.out.println("Inhalt des HashSet: " + autoSet);
        System.out.println(autoSet.add("Hyundai"));//false

        // Überprüfen, ob ein Element vorhanden ist
        System.out.println("Ist 'Audi' im Set? " + autoSet.contains("Audi"));//true
        System.out.println(autoSet.size());// 4

        // Entfernen eines Elements
        autoSet.remove("Audi");
        System.out.println("Nach Entfernen von 'Audi': " + autoSet);

        // ===============================
        // 3. VERZEICHNISSE (HashMap)
        // ===============================
        System.out.println("HASHSMap");
        System.out.println("=====================");
        // Erstellen einer HashMap und Hinzufügen von Schlüssel-Wert-Paaren
        HashMap<String, Integer> zahlenMap = new HashMap<>();
        zahlenMap.put("Eins", 1);
        zahlenMap.put("Zwei", 2);
        zahlenMap.put("Drei", 3);

        // Ausgabe der Map
        System.out.println("Inhalt der HashMap: " + zahlenMap);

        // Abrufen eines Werts über den Schlüssel
        System.out.println("Wert für 'Drei': " + zahlenMap.get("Drei"));

        // Überprüfen, ob ein Schlüssel vorhanden ist
        System.out.println("Enthält Schlüssel 'Eins'? " + zahlenMap.containsKey("Eins")); // true

        // Überprüfen, ob ein Wert vorhanden ist
        System.out.println("Enthält Wert '2'? " + zahlenMap.containsValue(2)); // true

        // Entfernen eines Schlüssel-Wert-Paars
        zahlenMap.remove("Zwei");
        System.out.println("Nach Entfernen von 'Zwei': " + zahlenMap);






















    }
}
