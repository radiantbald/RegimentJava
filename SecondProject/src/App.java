public class App {
    public static void main(String[] args) throws Exception {
        Regiment regiment = new Regiment();
        regiment.name = "1 мотострелковый полк";
        regiment.number = 31135;

        Batalion firstStrikeBatalion = new Batalion();
        firstStrikeBatalion.number = 1;
        firstStrikeBatalion.type = "Мотострелковый";
        firstStrikeBatalion.personnel = 276;

        Batalion secondTankBatalion = new Batalion(2, "Танковый", 241);

        Batalion secondStrikeBatalion = new Batalion(2, "Мотострелковый", 276);

        regiment.batalions.add(firstStrikeBatalion);
        regiment.batalions.add(secondStrikeBatalion);
        regiment.batalions.add(secondTankBatalion);

        for (int i = 0; i < regiment.batalions.size(); i++) {
            if (regiment.batalions.get(i).personnel < 250) {
                System.out.println(regiment.batalions.get(i).number + " " + regiment.batalions.get(i).type);
            }
        }

        for (Batalion batalion : regiment.batalions) {
            if (batalion.personnel > 250) {
                System.out.println(batalion.number + " " +  batalion.type);
            }
        }
        
    }
}
