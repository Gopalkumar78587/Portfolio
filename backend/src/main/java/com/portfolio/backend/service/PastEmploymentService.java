package com.portfolio.backend.service;

import com.portfolio.backend.entity.PastEmployment;
import java.util.List;

public interface PastEmploymentService {

    PastEmployment create(PastEmployment employment);

    List<PastEmployment> getAll();
}
