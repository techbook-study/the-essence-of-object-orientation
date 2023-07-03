package com.yohwan.study.objectbook.trial;

public interface Judge {
    Witness requestToCall(Caller caller);
    Witness requestToCall(Caller caller, Witness witness);
    void requestToTestify(Witness witness);
}
