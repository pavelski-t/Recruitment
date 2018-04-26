package com.mobysoft.domain.transaction;

import java.time.LocalDate;
import java.util.Set;
import java.util.UUID;

public class RentChargeTransaction implements Transaction {
    @Override
    public String getId() {
        return UUID.randomUUID().toString();
    }

    @Override
    public LocalDate getDate() {
        return null;
    }

    @Override
    public long getTransactionAmountInPence() {
        return 0;
    }

    @Override
    public Set<Enum<?>> getTags() {
        return null;
    }
}
