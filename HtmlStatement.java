public class HtmlStatement {

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
        return "<H1>Rentals for <EM>" + aCustomer.getName() +
                "</EM></H1><P>\n";
    }

    private String eachRentalString(Rental rental) {
        return rental.getMovie().getTitle() + ": " +
                rental.getCharge() + "<BR>\n";
    }

    private String footerString(Customer aCustomer) {
        String result = "<P>You owe <EM>" + aCustomer.getTotalCharge() +
                "</EM><P>\n";
        result += "On this rental you earned <EM>" +
                aCustomer.getTotalFrequentRenterPoints() +
                "</EM> frequent renter points<P>";
        return result;
    }
}
