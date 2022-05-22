package com.br.safefood.repository.customer;

import com.br.safefood.model.customer.ClientCardModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IClientCardRepository extends JpaRepository<ClientCardModel, Long> {

}
