@OneToMany(mappedBy = "sender")
private List<TransactionRecord> sentTransactions;

@OneToMany(mappedBy = "recipient")
private List<TransactionRecord> receivedTransactions;
