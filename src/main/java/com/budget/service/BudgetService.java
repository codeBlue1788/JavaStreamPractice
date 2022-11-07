package com.budget.service;

import com.budget.dao.IBudgetRepo;
import java.time.LocalDate;

public class BudgetService {

  private IBudgetRepo budgetRepo;

  public BudgetService(IBudgetRepo budgetRepo) {
    this.budgetRepo = budgetRepo;
  }

  public int queryBudget(LocalDate startLocalDate, LocalDate endLocalDate) {
    return 0;
  }
}
