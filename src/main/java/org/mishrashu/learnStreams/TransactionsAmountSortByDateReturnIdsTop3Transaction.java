package org.mishrashu.learnStreams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import org.mishrashu.supporting.classes.Transaction;

public class TransactionsAmountSortByDateReturnIdsTop3Transaction {

  public static void main(String[] args) {

    List<Transaction> transactions = getTransactionList();

    //Given a list of transactions, filter out the transactions that are above a certain amount,
    // sort them by date, and return the IDs of the top 3 transactions. Use streams for this.

    transactions
        .stream()
        .filter(object -> object.getAmount() > 201)
        .sorted(Comparator.comparing(
                Transaction::getTransactionDate)
            .thenComparing(Transaction::getAmount))
        .limit(3)
        .forEach(transaction -> {
          System.out.println(transaction.getId());
        });


  }

  private static List<Transaction> getTransactionList() {
    Transaction transaction1 = new Transaction(1, new Date(), 206.3);
    Transaction transaction2 = new Transaction(2, new Date(), 205.3);
    Transaction transaction3 = new Transaction(3, new Date(), 204.3);
    Transaction transaction4 = new Transaction(4, new Date(), 203.3);
    Transaction transaction5 = new Transaction(5, new Date(), 202.3);
    Transaction transaction6 = new Transaction(6, new Date(), 201.3);

    return Arrays.asList(transaction1, transaction2, transaction3,
        transaction4, transaction5, transaction6);
  }
}
