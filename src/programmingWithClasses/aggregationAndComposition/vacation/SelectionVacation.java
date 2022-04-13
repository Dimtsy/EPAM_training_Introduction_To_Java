package programmingWithClasses.aggregationAndComposition.vacation;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

public class SelectionVacation {
    private ArrayList<Vacation> vacations=new ArrayList<>();

    public SelectionVacation(ArrayList<Vacation> vacations) {
        this.vacations = vacations;
    }

    public SelectionVacation() {
    }

    public void addVacations(Vacation vacation) {
        vacations.add(vacation);
    }

    public SelectionVacation selectionEat(boolean eat) {
        SelectionVacation selectionVacation = new SelectionVacation();
        vacations.forEach(p->{if(eat){ selectionVacation.addVacations(p);}});
        return selectionVacation;
    }

    public SelectionVacation selectionVacationType(VacationType vacationType) {
        SelectionVacation selectionVacation = new SelectionVacation();
         vacations.forEach(p->{if(p.getVacationType().equals(vacationType)){ selectionVacation.addVacations(p);}});
        return selectionVacation;
    }

    public SelectionVacation selectionTransport(Transport transport) {
        return new SelectionVacation(vacations.stream().filter(p->p.getTransport().equals(transport)).
                collect(Collectors.toCollection(ArrayList::new)));
    }

    public SelectionVacation selectionNumberDay(int numberDay) {
        SelectionVacation selectionVacation = new SelectionVacation();
        vacations.forEach(p->{if(p.getNumberDay()>=numberDay) selectionVacation.addVacations(p); });
        return selectionVacation;
    }

    public void printVacation(){
        vacations.sort(Comparator.comparing(Vacation::getCountry));
        vacations.forEach(System.out::println);
    }

}
