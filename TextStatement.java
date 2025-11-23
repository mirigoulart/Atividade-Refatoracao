public class TextStatement {

    public String value(Customer aCustomer) {
        String result = headerString(aCustomer);

        Enumeration rentals = aCustomer.getRentals();
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            result += eachRentalString(each);
        }

        result += footerString(aCustomer);

        return result;
    }

    private String headerString(Customer aCustomer) {
        return "Rental Record for " + aCustomer.getName() + "\n";
    }

    private String eachRentalString(Rental rental) {
        return "\t" + rental.getMovie().getTitle() + "\t" +
                rental.getCharge() + "\n";
    }

    private String footerString(Customer aCustomer) {
        String result = "Amount owed is " + aCustomer.getTotalCharge() + "\n";
        result += "You earned " + aCustomer.getTotalFrequentRenterPoints() +
                " frequent renter points";
        return result;
    }
}
