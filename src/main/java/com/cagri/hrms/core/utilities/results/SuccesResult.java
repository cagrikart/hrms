package com.cagri.hrms.core.utilities.results;

public class SuccesResult extends Result{

    public SuccesResult(boolean success) {
        super(success);
    }

    public SuccesResult(boolean success, String messeage) {
        super(success, messeage);
    }
}
