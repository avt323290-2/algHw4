package ru.geekbrains.algHw4;



public class Program {

    public static void main(String[] args) {

        HashMap<String, String> hashMap = new HashMap<>(4);

        String res = hashMap.put("+79005554433", "Андрей");
        res = hashMap.put("+79005554432", "Алексей");
        res = hashMap.put("+79005554432", "Дарья");
        res = hashMap.put("+79005554433", "Марина");
        res = hashMap.put("+79005554434", "Сергей");
        res = hashMap.put("+79005554435", "Илона");
        res = hashMap.put("+79005554436", "Нонна");
        res = hashMap.put("+79005554437", "Михаил");
        res = hashMap.put("+79005554438", "Евгения");
        res = hashMap.put("+79005554439", "Глафира");


        res = hashMap.get("+79005554436");

        hashMap.remove("+79005554438");

        for (HashMap.Entity element : hashMap) {
            System.out.println(element.key + " - " + element.value);
        }

    }

}


