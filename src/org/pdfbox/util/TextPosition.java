/**
 * Copyright (c) 2003-2005, www.pdfbox.org
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice,
 *    this list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 * 3. Neither the name of pdfbox; nor the names of its
 *    contributors may be used to endorse or promote products derived from this
 *    software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED.  IN NO EVENT SHALL THE REGENTS OR CONTRIBUTORS BE LIABLE FOR ANY
 * DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON
 * ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *
 * http://www.pdfbox.org
 *
 */
package org.pdfbox.util;

import org.pdfbox.pdmodel.font.PDFont;

/**
 * This represents a character and a position on the screen of those characters.
 *
 * @author <a href="mailto:ben@benlitchfield.com">Ben Litchfield</a>
 * @version $Revision: 1.12 $
 */
public class TextPosition
{
    private float x;
    private float y;
    private float xScale;
    private float yScale;
    private float totalWidth;
    private float[] widths;
    private float height;
    private float widthOfSpace;
    private String c;
    private PDFont font;
    private float fontSize;
    private float wordSpacing;
    
    protected TextPosition()
    {
        
    }

    /**
     * Constructor.
     *
     * @param xPos The x coordinate of the character.
     * @param yPos The y coordinate of the character.
     * @param xScl The x scaling of the character.
     * @param yScl The y scaling of the character.
     * @param totalWidthValue The width of all the characters.
     * @param individualWidths The width of each individual character.
     * @param heightValue The height of the character.
     * @param spaceWidth The width of the space character.
     * @param string The character to be displayed.
     * @param currentFont The current for for this text position.
     * @param fontSizeValue The new font size.
     * @param ws The word spacing parameter
     */
    public TextPosition(
        float xPos,
        float yPos,
        float xScl,
        float yScl,
        float totalWidthValue,
        float[] individualWidths,
        float heightValue,
        float spaceWidth,
        String string,
        PDFont currentFont,
        float fontSizeValue,
        float ws
        )
    {
        this.x = xPos;
        this.y = yPos;
        this.xScale = xScl;
        this.yScale = yScl;
        this.totalWidth = totalWidthValue;
        this.widths = individualWidths;
        this.height = heightValue;
        this.widthOfSpace = spaceWidth;
        this.c = string;
        this.font = currentFont;
        this.fontSize = fontSizeValue;
        this.wordSpacing = ws;
    }

    /**
     * This will the character that will be displayed on the screen.
     *
     * @return The character on the screen.
     */
    public String getCharacter()
    {
        return c;
    }

    /**
     * This will get the x position of the character.
     *
     * @return The x coordinate of the character.
     */
    public float getX()
    {
        return x;
    }

    /**
     * This will get the y position of the character.
     *
     * @return The y coordinate of the character.
     */
    public float getY()
    {
        return y;
    }

    /**
     * This will get the width of this character.
     *
     * @return The width of this character.
     */
    public float getWidth()
    {
        return totalWidth;
    }
    
    /**
     * This will get the maximum height of all characters in this string.
     *
     * @return The maximum height of all characters in this string.
     */
    public float getHeight()
    {
        return height;
    }

    /**
     * This will get the font size that this object is
     * suppose to be drawn at.
     *
     * @return The font size.
     */
    public float getFontSize()
    {
        return fontSize;
    }

    /**
     * This will get the font for the text being drawn.
     *
     * @return The font size.
     */
    public PDFont getFont()
    {
        return font;
    }

    /**
     * This will get the current word spacing.
     *
     * @return The current word spacing.
     */
    public float getWordSpacing()
    {
        return wordSpacing;
    }

    /**
     * This will get the width of a space character.  This is useful for some
     * algorithms such as the text stripper, that need to know the width of a
     * space character.
     *
     * @return The width of a space character.
     */
    public float getWidthOfSpace()
    {
        return widthOfSpace;
    }
    /**
     * @return Returns the xScale.
     */
    public float getXScale()
    {
        return xScale;
    }
    /**
     * @param scale The xScale to set.
     */
    public void setXScale(float scale)
    {
        xScale = scale;
    }
    /**
     * @return Returns the yScale.
     */
    public float getYScale()
    {
        return yScale;
    }
    /**
     * @param scale The yScale to set.
     */
    public void setYScale(float scale)
    {
        yScale = scale;
    }
 
    /**
     * Get the widths of each individual character.
     * 
     * @return An array that is the same length as the length of the string.
     */
    public float[] getIndividualWidths()
    {
        return widths;
    }
    
    /**
     * Set the individual widths of every character.
     * 
     * @param individualWidths The individual widths of characters.
     */
    public void setIndividualWidths( float[] individualWidths )
    {
        widths = individualWidths;
    }
    
    /**
     * Show the string data for this text position.
     * 
     * @return A human readable form of this object.
     */
    public String toString()
    {
        return getCharacter();
    }
}