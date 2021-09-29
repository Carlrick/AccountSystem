package za.ac.nwu.ac.domain.service;

import za.ac.nwu.ac.domain.dto.NewName;

public class GeneralResponse<S> {
    private NewName newName;

    public GeneralResponse(boolean succesful, S echo) {
    }

    public void method()
    {
        newName = new NewName();

    }
}
