
package net.sf.mpxj.mpp;

import net.sf.mpxj.FieldContainer;
import net.sf.mpxj.FieldType;

/**
 * Represents the type and location of a bit flag within a block of data.
 */
public class MppBitFlag
{
   /**
    * Constructor.
    * 
    * @param type field type
    * @param offset offset in buffer
    * @param mask bit mask 
    */
   public MppBitFlag(FieldType type, int offset, int mask)
   {
      m_type = type;
      m_offset = offset;
      m_mask = mask;
   }

   /**
    * Extracts the value of this bit flag from the supplied byte array
    * and sets the value in the supplied container.
    * 
    * @param container container
    * @param data byte array
    */
   public void setValue(FieldContainer container, byte[] data)
   {
      container.set(m_type, Boolean.valueOf((data[m_offset] & m_mask) != 0));
   }

   private final FieldType m_type;
   private final int m_offset;
   private final int m_mask;
}
