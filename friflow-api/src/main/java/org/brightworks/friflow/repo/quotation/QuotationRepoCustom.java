package org.brightworks.friflow.repo.quotation;

import org.brightworks.friflow.domain.dto.QuotationDTO;
import org.brightworks.friflow.domain.process.ProcessStatus;
import org.joda.time.LocalDate;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * @author kyel
 */
public interface QuotationRepoCustom {

    Page<QuotationDTO> search(String ticketNumber,
                              String description,
                              String clientName,
                              LocalDate startDate,
                              LocalDate endDate,
                              ProcessStatus status,
                              Pageable pageable);

}
