package com.example.TestDB.service;

import org.springframework.stereotype.Service;

// import org.springframework.beans.factory.annotation.Autowired;
// import com.example.TestDB.dto.RecommendationDTO;
// import com.example.TestDB.mapperImp.RecommendationMapperImp;
// import com.example.TestDB.model.Recommendation;
// import com.example.TestDB.repository.RecommendationRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class RecommendationService {
    // @Autowired
    // private RecommendationRepository recommendationRepository;
    // private static final RecommendationMapperImp recommendationMapperImp = new RecommendationMapperImp();

    // public RecommendationDTO createRecommendationDTO(RecommendationDTO recommendationDTO) {

    //     Recommendation recommendation = Recommendation.builder().Reco_id(recommendationDTO.getReco_id())
    //             .NationalID(recommendationDTO.getNationalID()).Eduid(recommendationDTO.getEduid())
    //             .cr(recommendationDTO.getCr()).Reco_From(recommendationDTO.getReco_From())
    //             .Reco_Date(recommendationDTO.getReco_Date()).Reco_AddBy(recommendationDTO.getReco_AddBy())
    //             .Reco_Attach(recommendationDTO.getReco_Attach())
    //             .Reco_Institute_Name(recommendationDTO.getReco_Institute_Name())

    //             .build();
    //     Recommendation saveRecommendation = recommendationRepository.save(recommendation);
    //     return recommendationMapperImp.domainToDto(saveRecommendation);

    // }

}
