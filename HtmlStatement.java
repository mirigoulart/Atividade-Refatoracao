public class HtmlStatement extends Statement {

    @Override
    protected String headerString(Customer aCustomer) {
        return "<H1>Rentals for <EM>" + aCustomer.getName() +
               "</EM></H1><P>\n";
    }

    @Override
    protected String eachRentalString(Rental rental) {
        return rental.getMovie().getTitle() + ": " +
               rental.getCharge() + "<BR>\n";
    }

    @Override
    protected String footerString(Customer aCustomer) {
        String result = "<P>You owe <EM>" + aCustomer.getTotalCharge() +
                        "</EM><P>\n";
        result += "On this rental you earned <EM>" +
                  aCustomer.getTotalFrequentRenterPoints() +
                  "</EM> frequent renter points<P>";
        return result;
    }
}
