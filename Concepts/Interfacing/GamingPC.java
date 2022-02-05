package Concepts.Interfacing;

import Concepts.Interfacing.Interfaces.*;

public class GamingPC implements GraphicsCard, Motherboard, Processor, SSDStorage, HDDStorage{
    public GamingPC(){}

    @Override
    public boolean fitGraphicsCard(){ return true; }

    @Override
    public boolean fitMotherboard(){ return true; }

    @Override
    public boolean fitProcessor(){ return true; }

    @Override
    public boolean fitStorage(){ return true; }

    public GamingPC getPC(){return this; }
}
