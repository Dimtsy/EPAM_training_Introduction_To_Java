package programmingWithClasses.aggregationAndComposition.vacation;

public class Main {
    public static void main(String[] args) {
        SelectionVacation selectionVacation = new SelectionVacation();
        selectionVacation.addVacations(new Vacation("Италия",VacationType.CRUISE,Transport.PLANE,20,true));
        selectionVacation.addVacations(new Vacation("Беларусь",VacationType.SHOPPING,Transport.TRAIN,15,false));
        selectionVacation.addVacations(new Vacation("Египт",VacationType.CRUISE,Transport.PLANE,20,true));
        selectionVacation.addVacations(new Vacation("Турция",VacationType.EXCURSIONS,Transport.PLANE,15,true));

        System.out.println("Все экскурсии, с перелетом, от 5 дней, с питанием:");
        selectionVacation.
                selectionVacationType(VacationType.EXCURSIONS).
                selectionTransport(Transport.PLANE).
                selectionNumberDay(5).
                selectionEat(true).
                printVacation();

        System.out.println("Все путевки на самолете:");
        selectionVacation.
                selectionTransport(Transport.PLANE).
                printVacation();

    }
}
