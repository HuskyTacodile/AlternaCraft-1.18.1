package com.huskytacodile.alternacraft.client.render.entity;


import com.huskytacodile.alternacraft.client.model.entity.MaleSpinoModel;

import com.huskytacodile.alternacraft.entities.MaleSpinoEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import javax.annotation.Nullable;

public class MaleSpinoRenderer extends GeoEntityRenderer<MaleSpinoEntity>
{
    public MaleSpinoRenderer(EntityRendererProvider.Context entityRendererProvider) {
        super(entityRendererProvider, new MaleSpinoModel());
        this.shadowRadius = 4.0F;
    }

    @Override
    public RenderType getRenderType(MaleSpinoEntity animatable, float partialTicks, PoseStack stack,
                                    @Nullable MultiBufferSource multiBufferSource, VertexConsumer vertexConsumer, int packedLightIn,
                                    ResourceLocation textureLocation)
    {
        return RenderType.entityTranslucent(getTextureLocation(animatable));
    }
    @Override
    protected float getDeathMaxRotation(MaleSpinoEntity entityLivingBaseIn){
        return 0.0F;
    }
}
