package com.ornekRest.iller.Service;

import com.ornekRest.iller.Controller.Exceptions;
import com.ornekRest.iller.Repository.ilRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ornekRest.iller.Model.il;

import java.util.List;
import java.util.Optional;
@Service
@AllArgsConstructor //ilRepoyu otomatik olarak inject ediyor.
public class ilService {
    private final ilRepository ilRepo;

    public List<il> getiller()
    {
        return ilRepo.findAll();

    }
    public il getById(String id)
    {
        return ilRepo.findById(id).orElseThrow(()->new Exceptions("il not found"));
    }

    public il createIl(il yeni)
    {
        return ilRepo.save(yeni);
    }
public void deleteIl(String id) {
        ilRepo.deleteById(id);
}


public void update(String id,il yeni)
{
    var sehir=getById(id);
    sehir.setName(yeni.getName());;
    ilRepo.save(sehir);
}


public il search(String name)
{

        return ilRepo.findByName(name);}
}

