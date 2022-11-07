package com.budget.dao;

import com.budget.service.model.Budget;
import java.util.List;

public interface IBudgetRepo {

  List<Budget> findAll();

}
