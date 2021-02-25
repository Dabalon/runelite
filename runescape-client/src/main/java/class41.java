import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ah")
public class class41 {
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "(Lcq;Lcq;IZI)I",
      garbageValue = "-1892807226"
   )
   @Export("compareWorlds")
   static int compareWorlds(World var0, World var1, int var2, boolean var3) {
      if (var2 == 1) {
         int var4 = var0.population;
         int var5 = var1.population;
         if (!var3) {
            if (var4 == -1) {
               var4 = 2001;
            }

            if (var5 == -1) {
               var5 = 2001;
            }
         }

         return var4 - var5;
      } else if (var2 == 2) {
         return var0.location - var1.location;
      } else if (var2 == 3) {
         if (var0.activity.equals("-")) {
            if (var1.activity.equals("-")) {
               return 0;
            } else {
               return var3 ? -1 : 1;
            }
         } else if (var1.activity.equals("-")) {
            return var3 ? 1 : -1;
         } else {
            return var0.activity.compareTo(var1.activity);
         }
      } else if (var2 == 4) {
         return var0.method1880() ? (var1.method1880() ? 0 : 1) : (var1.method1880() ? -1 : 0);
      } else if (var2 == 5) {
         return var0.method1878() ? (var1.method1878() ? 0 : 1) : (var1.method1878() ? -1 : 0);
      } else if (var2 == 6) {
         return var0.isPvp() ? (var1.isPvp() ? 0 : 1) : (var1.isPvp() ? -1 : 0);
      } else if (var2 == 7) {
         return var0.isMembersOnly() ? (var1.isMembersOnly() ? 0 : 1) : (var1.isMembersOnly() ? -1 : 0);
      } else {
         return var0.id - var1.id;
      }
   }

   @ObfuscatedName("hw")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-20058245"
   )
   static void method650() {
      GrandExchangeOfferTotalQuantityComparator.method162(CollisionMap.menuWidth / 2 + ApproximateRouteStrategy.menuX, AbstractUserComparator.menuY);
   }

   @ObfuscatedName("ii")
   @ObfuscatedSignature(
      descriptor = "([Lhz;IIIIIIIII)V",
      garbageValue = "-1513061199"
   )
   @Export("drawInterface")
   static final void drawInterface(Widget[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5);
      Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D();

      for(int var9 = 0; var9 < var0.length; ++var9) {
         Widget var10 = var0[var9];
         if (var10 != null && (var10.parentId == var1 || var1 == -1412584499 && var10 == Client.clickedWidget)) {
            int var11;
            if (var8 == -1) {
               Client.rootWidgetXs[Client.rootWidgetCount] = var10.x + var6;
               Client.rootWidgetYs[Client.rootWidgetCount] = var7 + var10.y;
               Client.rootWidgetWidths[Client.rootWidgetCount] = var10.width;
               Client.rootWidgetHeights[Client.rootWidgetCount] = var10.height;
               var11 = ++Client.rootWidgetCount - 1;
            } else {
               var11 = var8;
            }

            var10.rootIndex = var11;
            var10.cycle = Client.cycle;
            if (!var10.isIf3 || !DevicePcmPlayerProvider.isComponentHidden(var10)) {
               if (var10.contentType > 0) {
                  WorldMapSection2.method401(var10);
               }

               int var12 = var10.x + var6;
               int var13 = var7 + var10.y;
               int var14 = var10.transparencyTop;
               int var15;
               int var16;
               if (var10 == Client.clickedWidget) {
                  if (var1 != -1412584499 && !var10.isScrollBar) {
                     WorldMapAreaData.field362 = var0;
                     WorldMapIcon_1.field218 = var6;
                     GrandExchangeOfferOwnWorldComparator.field656 = var7;
                     continue;
                  }

                  if (Client.isDraggingWidget && Client.field912) {
                     var15 = MouseHandler.MouseHandler_x;
                     var16 = MouseHandler.MouseHandler_y;
                     var15 -= Client.widgetClickX;
                     var16 -= Client.widgetClickY;
                     if (var15 < Client.field714) {
                        var15 = Client.field714;
                     }

                     if (var15 + var10.width > Client.field714 + Client.clickedWidgetParent.width) {
                        var15 = Client.field714 + Client.clickedWidgetParent.width - var10.width;
                     }

                     if (var16 < Client.field844) {
                        var16 = Client.field844;
                     }

                     if (var16 + var10.height > Client.field844 + Client.clickedWidgetParent.height) {
                        var16 = Client.field844 + Client.clickedWidgetParent.height - var10.height;
                     }

                     var12 = var15;
                     var13 = var16;
                  }

                  if (!var10.isScrollBar) {
                     var14 = 128;
                  }
               }

               int var17;
               int var18;
               int var19;
               int var20;
               int var21;
               int var22;
               if (var10.type == 2) {
                  var15 = var2;
                  var16 = var3;
                  var17 = var4;
                  var18 = var5;
               } else if (var10.type == 9) {
                  var19 = var12;
                  var20 = var13;
                  var21 = var12 + var10.width;
                  var22 = var13 + var10.height;
                  if (var21 < var12) {
                     var19 = var21;
                     var21 = var12;
                  }

                  if (var22 < var13) {
                     var20 = var22;
                     var22 = var13;
                  }

                  ++var21;
                  ++var22;
                  var15 = var19 > var2 ? var19 : var2;
                  var16 = var20 > var3 ? var20 : var3;
                  var17 = var21 < var4 ? var21 : var4;
                  var18 = var22 < var5 ? var22 : var5;
               } else {
                  var19 = var12 + var10.width;
                  var20 = var13 + var10.height;
                  var15 = var12 > var2 ? var12 : var2;
                  var16 = var13 > var3 ? var13 : var3;
                  var17 = var19 < var4 ? var19 : var4;
                  var18 = var20 < var5 ? var20 : var5;
               }

               if (!var10.isIf3 || var15 < var17 && var16 < var18) {
                  if (var10.contentType != 0) {
                     if (var10.contentType == 1336) {
                        if (Client.displayFps) {
                           var13 += 15;
                           Login.fontPlain12.drawRightAligned("Fps:" + GameEngine.fps, var12 + var10.width, var13, 16776960, -1);
                           var13 += 15;
                           Runtime var42 = Runtime.getRuntime();
                           var20 = (int)((var42.totalMemory() - var42.freeMemory()) / 1024L);
                           var21 = 16776960;
                           if (var20 > 327680 && !Client.isLowDetail) {
                              var21 = 16711680;
                           }

                           Login.fontPlain12.drawRightAligned("Mem:" + var20 + "k", var12 + var10.width, var13, var21, -1);
                           var13 += 15;
                        }
                        continue;
                     }

                     if (var10.contentType == 1337) {
                        Client.viewportX = var12;
                        Client.viewportY = var13;
                        class13.drawEntities(var12, var13, var10.width, var10.height);
                        Client.field816[var10.rootIndex] = true;
                        Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5);
                        continue;
                     }

                     if (var10.contentType == 1338) {
                        class204.drawMinimap(var10, var12, var13, var11);
                        Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5);
                        continue;
                     }

                     if (var10.contentType == 1339) {
                        Message.drawCompass(var10, var12, var13, var11);
                        Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5);
                        continue;
                     }

                     if (var10.contentType == 1400) {
                        SoundSystem.worldMap.draw(var12, var13, var10.width, var10.height, Client.cycle);
                     }

                     if (var10.contentType == 1401) {
                        SoundSystem.worldMap.drawOverview(var12, var13, var10.width, var10.height);
                     }

                     if (var10.contentType == 1402) {
                        class9.loginScreenRunesAnimation.draw(var12, Client.cycle);
                     }
                  }

                  if (var10.type == 0) {
                     if (!var10.isIf3 && DevicePcmPlayerProvider.isComponentHidden(var10) && var10 != Canvas.mousedOverWidgetIf1) {
                        continue;
                     }

                     if (!var10.isIf3) {
                        if (var10.scrollY > var10.scrollHeight - var10.height) {
                           var10.scrollY = var10.scrollHeight - var10.height;
                        }

                        if (var10.scrollY < 0) {
                           var10.scrollY = 0;
                        }
                     }

                     drawInterface(var0, var10.id, var15, var16, var17, var18, var12 - var10.scrollX, var13 - var10.scrollY, var11);
                     if (var10.children != null) {
                        drawInterface(var10.children, var10.id, var15, var16, var17, var18, var12 - var10.scrollX, var13 - var10.scrollY, var11);
                     }

                     InterfaceParent var30 = (InterfaceParent)Client.interfaceParents.get((long)var10.id);
                     if (var30 != null) {
                        ViewportMouse.drawWidgets(var30.group, var15, var16, var17, var18, var12, var13, var11);
                     }

                     Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5);
                     Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D();
                  }

                  if (Client.isResizable || Client.field871[var11] || Client.gameDrawingMode > 1) {
                     if (var10.type == 0 && !var10.isIf3 && var10.scrollHeight > var10.height) {
                        WorldMapLabelSize.drawScrollBar(var12 + var10.width, var13, var10.scrollY, var10.height, var10.scrollHeight);
                     }

                     if (var10.type != 1) {
                        int var23;
                        int var24;
                        int var25;
                        int var26;
                        if (var10.type == 2) {
                           var19 = 0;

                           for(var20 = 0; var20 < var10.rawHeight; ++var20) {
                              for(var21 = 0; var21 < var10.rawWidth; ++var21) {
                                 var22 = var21 * (var10.paddingX + 32) + var12;
                                 var23 = var20 * (var10.paddingY + 32) + var13;
                                 if (var19 < 20) {
                                    var22 += var10.inventoryXOffsets[var19];
                                    var23 += var10.inventoryYOffsets[var19];
                                 }

                                 if (var10.itemIds[var19] <= 0) {
                                    if (var10.inventorySprites != null && var19 < 20) {
                                       SpritePixels var46 = var10.getInventorySprite(var19);
                                       if (var46 != null) {
                                          var46.drawTransBgAt(var22, var23);
                                       } else if (Widget.field2591) {
                                          IsaacCipher.invalidateWidget(var10);
                                       }
                                    }
                                 } else {
                                    boolean var37 = false;
                                    boolean var38 = false;
                                    var26 = var10.itemIds[var19] - 1;
                                    if (var22 + 32 > var2 && var22 < var4 && var23 + 32 > var3 && var23 < var5 || var10 == JagexCache.dragInventoryWidget && var19 == Client.dragItemSlotSource) {
                                       SpritePixels var35;
                                       if (Client.isItemSelected == 1 && var19 == class195.selectedItemSlot && var10.id == ClientPacket.selectedItemWidget) {
                                          var35 = TaskHandler.getItemSprite(var26, var10.itemQuantities[var19], 2, 0, 2, false);
                                       } else {
                                          var35 = TaskHandler.getItemSprite(var26, var10.itemQuantities[var19], 1, 3153952, 2, false);
                                       }

                                       if (var35 != null) {
                                          if (var10 == JagexCache.dragInventoryWidget && var19 == Client.dragItemSlotSource) {
                                             var24 = MouseHandler.MouseHandler_x - Client.draggedWidgetX;
                                             var25 = MouseHandler.MouseHandler_y - Client.draggedWidgetY;
                                             if (var24 < 5 && var24 > -5) {
                                                var24 = 0;
                                             }

                                             if (var25 < 5 && var25 > -5) {
                                                var25 = 0;
                                             }

                                             if (Client.itemDragDuration < 5) {
                                                var24 = 0;
                                                var25 = 0;
                                             }

                                             var35.drawTransAt(var22 + var24, var23 + var25, 128);
                                             if (var1 != -1) {
                                                Widget var28 = var0[var1 & '\uffff'];
                                                int var29;
                                                if (var23 + var25 < Rasterizer2D.Rasterizer2D_yClipStart && var28.scrollY > 0) {
                                                   var29 = (Rasterizer2D.Rasterizer2D_yClipStart - var23 - var25) * Client.field808 / 3;
                                                   if (var29 > Client.field808 * 10) {
                                                      var29 = Client.field808 * 10;
                                                   }

                                                   if (var29 > var28.scrollY) {
                                                      var29 = var28.scrollY;
                                                   }

                                                   var28.scrollY -= var29;
                                                   Client.draggedWidgetY += var29;
                                                   IsaacCipher.invalidateWidget(var28);
                                                }

                                                if (var25 + var23 + 32 > Rasterizer2D.Rasterizer2D_yClipEnd && var28.scrollY < var28.scrollHeight - var28.height) {
                                                   var29 = (var25 + var23 + 32 - Rasterizer2D.Rasterizer2D_yClipEnd) * Client.field808 / 3;
                                                   if (var29 > Client.field808 * 10) {
                                                      var29 = Client.field808 * 10;
                                                   }

                                                   if (var29 > var28.scrollHeight - var28.height - var28.scrollY) {
                                                      var29 = var28.scrollHeight - var28.height - var28.scrollY;
                                                   }

                                                   var28.scrollY += var29;
                                                   Client.draggedWidgetY -= var29;
                                                   IsaacCipher.invalidateWidget(var28);
                                                }
                                             }
                                          } else if (var10 == WorldMapSprite.field260 && var19 == Client.field931) {
                                             var35.drawTransAt(var22, var23, 128);
                                          } else {
                                             var35.drawTransBgAt(var22, var23);
                                          }
                                       } else {
                                          IsaacCipher.invalidateWidget(var10);
                                       }
                                    }
                                 }

                                 ++var19;
                              }
                           }
                        } else if (var10.type == 3) {
                           if (GrandExchangeOfferWorldComparator.runCs1(var10)) {
                              var19 = var10.color2;
                              if (var10 == Canvas.mousedOverWidgetIf1 && var10.mouseOverColor2 != 0) {
                                 var19 = var10.mouseOverColor2;
                              }
                           } else {
                              var19 = var10.color;
                              if (var10 == Canvas.mousedOverWidgetIf1 && var10.mouseOverColor != 0) {
                                 var19 = var10.mouseOverColor;
                              }
                           }

                           if (var10.fill) {
                              switch(var10.fillMode.field3898) {
                              case 1:
                                 Rasterizer2D.Rasterizer2D_fillRectangleGradient(var12, var13, var10.width, var10.height, var10.color, var10.color2);
                                 break;
                              case 2:
                                 Rasterizer2D.Rasterizer2D_fillRectangleGradientAlpha(var12, var13, var10.width, var10.height, var10.color, var10.color2, 255 - (var10.transparencyTop & 255), 255 - (var10.transparencyBot & 255));
                                 break;
                              default:
                                 if (var14 == 0) {
                                    Rasterizer2D.Rasterizer2D_fillRectangle(var12, var13, var10.width, var10.height, var19);
                                 } else {
                                    Rasterizer2D.Rasterizer2D_fillRectangleAlpha(var12, var13, var10.width, var10.height, var19, 256 - (var14 & 255));
                                 }
                              }
                           } else if (var14 == 0) {
                              Rasterizer2D.Rasterizer2D_drawRectangle(var12, var13, var10.width, var10.height, var19);
                           } else {
                              Rasterizer2D.Rasterizer2D_drawRectangleAlpha(var12, var13, var10.width, var10.height, var19, 256 - (var14 & 255));
                           }
                        } else {
                           Font var39;
                           if (var10.type == 4) {
                              var39 = var10.getFont();
                              if (var39 == null) {
                                 if (Widget.field2591) {
                                    IsaacCipher.invalidateWidget(var10);
                                 }
                              } else {
                                 String var44 = var10.text;
                                 if (GrandExchangeOfferWorldComparator.runCs1(var10)) {
                                    var20 = var10.color2;
                                    if (var10 == Canvas.mousedOverWidgetIf1 && var10.mouseOverColor2 != 0) {
                                       var20 = var10.mouseOverColor2;
                                    }

                                    if (var10.text2.length() > 0) {
                                       var44 = var10.text2;
                                    }
                                 } else {
                                    var20 = var10.color;
                                    if (var10 == Canvas.mousedOverWidgetIf1 && var10.mouseOverColor != 0) {
                                       var20 = var10.mouseOverColor;
                                    }
                                 }

                                 if (var10.isIf3 && var10.itemId != -1) {
                                    ItemComposition var45 = class281.ItemDefinition_get(var10.itemId);
                                    var44 = var45.name;
                                    if (var44 == null) {
                                       var44 = "null";
                                    }

                                    if ((var45.isStackable == 1 || var10.itemQuantity != 1) && var10.itemQuantity != -1) {
                                       var44 = FileSystem.colorStartTag(16748608) + var44 + "</col>" + " " + 'x' + WorldMapRectangle.formatItemStacks(var10.itemQuantity);
                                    }
                                 }

                                 if (var10 == Client.meslayerContinueWidget) {
                                    var44 = "Please wait...";
                                    var20 = var10.color;
                                 }

                                 if (!var10.isIf3) {
                                    var44 = class9.method95(var44, var10);
                                 }

                                 var39.drawLines(var44, var12, var13, var10.width, var10.height, var20, var10.textShadowed ? 0 : -1, var10.textXAlignment, var10.textYAlignment, var10.textLineHeight);
                              }
                           } else if (var10.type == 5) {
                              SpritePixels var40;
                              if (!var10.isIf3) {
                                 var40 = var10.getSprite(GrandExchangeOfferWorldComparator.runCs1(var10));
                                 if (var40 != null) {
                                    var40.drawTransBgAt(var12, var13);
                                 } else if (Widget.field2591) {
                                    IsaacCipher.invalidateWidget(var10);
                                 }
                              } else {
                                 if (var10.itemId != -1) {
                                    var40 = TaskHandler.getItemSprite(var10.itemId, var10.itemQuantity, var10.outline, var10.spriteShadow, var10.itemQuantityMode, false);
                                 } else {
                                    var40 = var10.getSprite(false);
                                 }

                                 if (var40 == null) {
                                    if (Widget.field2591) {
                                       IsaacCipher.invalidateWidget(var10);
                                    }
                                 } else {
                                    var20 = var40.width;
                                    var21 = var40.height;
                                    if (!var10.spriteTiling) {
                                       var22 = var10.width * 4096 / var20;
                                       if (var10.spriteAngle != 0) {
                                          var40.method6425(var10.width / 2 + var12, var10.height / 2 + var13, var10.spriteAngle, var22);
                                       } else if (var14 != 0) {
                                          var40.drawTransScaledAt(var12, var13, var10.width, var10.height, 256 - (var14 & 255));
                                       } else if (var20 == var10.width && var21 == var10.height) {
                                          var40.drawTransBgAt(var12, var13);
                                       } else {
                                          var40.drawScaledAt(var12, var13, var10.width, var10.height);
                                       }
                                    } else {
                                       Rasterizer2D.Rasterizer2D_expandClip(var12, var13, var12 + var10.width, var13 + var10.height);
                                       var22 = (var20 - 1 + var10.width) / var20;
                                       var23 = (var21 - 1 + var10.height) / var21;

                                       for(var24 = 0; var24 < var22; ++var24) {
                                          for(var25 = 0; var25 < var23; ++var25) {
                                             if (var10.spriteAngle != 0) {
                                                var40.method6425(var20 / 2 + var12 + var20 * var24, var21 / 2 + var13 + var21 * var25, var10.spriteAngle, 4096);
                                             } else if (var14 != 0) {
                                                var40.drawTransAt(var12 + var24 * var20, var13 + var25 * var21, 256 - (var14 & 255));
                                             } else {
                                                var40.drawTransBgAt(var12 + var24 * var20, var13 + var21 * var25);
                                             }
                                          }
                                       }

                                       Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5);
                                    }
                                 }
                              }
                           } else {
                              ItemComposition var33;
                              if (var10.type == 6) {
                                 boolean var36 = GrandExchangeOfferWorldComparator.runCs1(var10);
                                 if (var36) {
                                    var20 = var10.sequenceId2;
                                 } else {
                                    var20 = var10.sequenceId;
                                 }

                                 Model var41 = null;
                                 var22 = 0;
                                 if (var10.itemId != -1) {
                                    var33 = class281.ItemDefinition_get(var10.itemId);
                                    if (var33 != null) {
                                       var33 = var33.getCountObj(var10.itemQuantity);
                                       var41 = var33.getModel(1);
                                       if (var41 != null) {
                                          var41.calculateBoundsCylinder();
                                          var22 = var41.height / 2;
                                       } else {
                                          IsaacCipher.invalidateWidget(var10);
                                       }
                                    }
                                 } else if (var10.modelType == 5) {
                                    if (var10.modelId == 0) {
                                       var41 = Client.playerComposition.getModel((SequenceDefinition)null, -1, (SequenceDefinition)null, -1);
                                    } else {
                                       var41 = UserComparator9.localPlayer.getModel();
                                    }
                                 } else if (var20 == -1) {
                                    var41 = var10.getModel((SequenceDefinition)null, -1, var36, UserComparator9.localPlayer.appearance);
                                    if (var41 == null && Widget.field2591) {
                                       IsaacCipher.invalidateWidget(var10);
                                    }
                                 } else {
                                    SequenceDefinition var47 = InterfaceParent.SequenceDefinition_get(var20);
                                    var41 = var10.getModel(var47, var10.modelFrame, var36, UserComparator9.localPlayer.appearance);
                                    if (var41 == null && Widget.field2591) {
                                       IsaacCipher.invalidateWidget(var10);
                                    }
                                 }

                                 Rasterizer3D.method3169(var10.width / 2 + var12, var10.height / 2 + var13);
                                 var23 = Rasterizer3D.Rasterizer3D_sine[var10.modelAngleX] * var10.modelZoom >> 16;
                                 var24 = Rasterizer3D.Rasterizer3D_cosine[var10.modelAngleX] * var10.modelZoom >> 16;
                                 if (var41 != null) {
                                    if (!var10.isIf3) {
                                       var41.method3106(0, var10.modelAngleY, 0, var10.modelAngleX, 0, var23, var24);
                                    } else {
                                       var41.calculateBoundsCylinder();
                                       if (var10.modelOrthog) {
                                          var41.method3053(0, var10.modelAngleY, var10.modelAngleZ, var10.modelAngleX, var10.modelOffsetX, var23 + var22 + var10.modelOffsetY, var24 + var10.modelOffsetY, var10.modelZoom);
                                       } else {
                                          var41.method3106(0, var10.modelAngleY, var10.modelAngleZ, var10.modelAngleX, var10.modelOffsetX, var23 + var22 + var10.modelOffsetY, var24 + var10.modelOffsetY);
                                       }
                                    }
                                 }

                                 Rasterizer3D.Rasterizer3D_method3();
                              } else {
                                 if (var10.type == 7) {
                                    var39 = var10.getFont();
                                    if (var39 == null) {
                                       if (Widget.field2591) {
                                          IsaacCipher.invalidateWidget(var10);
                                       }
                                       continue;
                                    }

                                    var20 = 0;

                                    for(var21 = 0; var21 < var10.rawHeight; ++var21) {
                                       for(var22 = 0; var22 < var10.rawWidth; ++var22) {
                                          if (var10.itemIds[var20] > 0) {
                                             var33 = class281.ItemDefinition_get(var10.itemIds[var20] - 1);
                                             String var34;
                                             if (var33.isStackable != 1 && var10.itemQuantities[var20] == 1) {
                                                var34 = FileSystem.colorStartTag(16748608) + var33.name + "</col>";
                                             } else {
                                                var34 = FileSystem.colorStartTag(16748608) + var33.name + "</col>" + " " + 'x' + WorldMapRectangle.formatItemStacks(var10.itemQuantities[var20]);
                                             }

                                             var25 = var22 * (var10.paddingX + 115) + var12;
                                             var26 = var21 * (var10.paddingY + 12) + var13;
                                             if (var10.textXAlignment == 0) {
                                                var39.draw(var34, var25, var26, var10.color, var10.textShadowed ? 0 : -1);
                                             } else if (var10.textXAlignment == 1) {
                                                var39.drawCentered(var34, var10.width / 2 + var25, var26, var10.color, var10.textShadowed ? 0 : -1);
                                             } else {
                                                var39.drawRightAligned(var34, var25 + var10.width - 1, var26, var10.color, var10.textShadowed ? 0 : -1);
                                             }
                                          }

                                          ++var20;
                                       }
                                    }
                                 }

                                 if (var10.type == 8 && var10 == GrandExchangeOffer.field100 && Client.field815 == Client.field925) {
                                    var19 = 0;
                                    var20 = 0;
                                    Font var31 = Login.fontPlain12;
                                    String var32 = var10.text;

                                    String var43;
                                    for(var32 = class9.method95(var32, var10); var32.length() > 0; var20 = var20 + var31.ascent + 1) {
                                       var24 = var32.indexOf("<br>");
                                       if (var24 != -1) {
                                          var43 = var32.substring(0, var24);
                                          var32 = var32.substring(var24 + 4);
                                       } else {
                                          var43 = var32;
                                          var32 = "";
                                       }

                                       var25 = var31.stringWidth(var43);
                                       if (var25 > var19) {
                                          var19 = var25;
                                       }
                                    }

                                    var19 += 6;
                                    var20 += 7;
                                    var24 = var12 + var10.width - 5 - var19;
                                    var25 = var13 + var10.height + 5;
                                    if (var24 < var12 + 5) {
                                       var24 = var12 + 5;
                                    }

                                    if (var24 + var19 > var4) {
                                       var24 = var4 - var19;
                                    }

                                    if (var20 + var25 > var5) {
                                       var25 = var5 - var20;
                                    }

                                    Rasterizer2D.Rasterizer2D_fillRectangle(var24, var25, var19, var20, 16777120);
                                    Rasterizer2D.Rasterizer2D_drawRectangle(var24, var25, var19, var20, 0);
                                    var32 = var10.text;
                                    var26 = var25 + var31.ascent + 2;

                                    for(var32 = class9.method95(var32, var10); var32.length() > 0; var26 = var26 + var31.ascent + 1) {
                                       int var27 = var32.indexOf("<br>");
                                       if (var27 != -1) {
                                          var43 = var32.substring(0, var27);
                                          var32 = var32.substring(var27 + 4);
                                       } else {
                                          var43 = var32;
                                          var32 = "";
                                       }

                                       var31.draw(var43, var24 + 3, var26, 0, -1);
                                    }
                                 }

                                 if (var10.type == 9) {
                                    if (var10.field2627) {
                                       var19 = var12;
                                       var20 = var13 + var10.height;
                                       var21 = var12 + var10.width;
                                       var22 = var13;
                                    } else {
                                       var19 = var12;
                                       var20 = var13;
                                       var21 = var12 + var10.width;
                                       var22 = var13 + var10.height;
                                    }

                                    if (var10.lineWid == 1) {
                                       Rasterizer2D.Rasterizer2D_drawLine(var19, var20, var21, var22, var10.color);
                                    } else {
                                       GrandExchangeOfferNameComparator.method199(var19, var20, var21, var22, var10.color, var10.lineWid);
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      }

   }
}