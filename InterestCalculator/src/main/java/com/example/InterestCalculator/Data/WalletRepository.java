package com.example.InterestCalculator.Data;

import com.example.InterestCalculator.Classes.Wallet;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WalletRepository extends CrudRepository<Wallet, Integer> {
}
