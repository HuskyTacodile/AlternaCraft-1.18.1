package com.huskytacodile.alternacraft.client.render.entity;

import com.huskytacodile.alternacraft.client.model.entity.IndominusElementalModel;
import com.huskytacodile.alternacraft.client.model.entity.IndoraptorMaleModel;
import com.huskytacodile.alternacraft.entities.IndoraptorMaleEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import javax.annotation.Nullable;

public class IndoraptorMaleRenderer extends GeoEntityRenderer<IndoraptorMaleEntity>
{
    public IndoraptorMaleRenderer(EntityRendererProvider.Context entityRendererProvider) {
        super(entityRendererProvider, new IndoraptorMaleModel());
        this.shadowRadius = 4.0F;
    }

    @Override
    public RenderType getRenderType(IndoraptorMaleEntity animatable, float partialTicks, PoseStack stack,
                                    @Nullable MultiBufferSource multiBufferSource, VertexConsumer vertexConsumer, int packedLightIn,
                                    ResourceLocation textureLocation)
    {
        return RenderType.entityTranslucent(getTextureLocation(animatable));
    }
    @Override
    protected float getDeathMaxRotation(IndoraptorMaleEntity entityLivingBaseIn){
        return 0.0F;
    }
}
