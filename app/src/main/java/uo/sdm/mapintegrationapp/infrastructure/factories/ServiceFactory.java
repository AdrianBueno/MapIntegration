package uo.sdm.mapintegrationapp.infrastructure.factories;

import uo.sdm.mapintegrationapp.infrastructure.services.ICardService;
import uo.sdm.mapintegrationapp.infrastructure.services.ISoundService;
import uo.sdm.mapintegrationapp.infrastructure.services.imp.CardService;
import uo.sdm.mapintegrationapp.infrastructure.services.imp.SoundService;

/**
 * Created by Adrian on 28/06/2015.
 */
public class ServiceFactory {
    public static ISoundService soundService = new SoundService();
    public static ICardService cardService = new CardService();
}
