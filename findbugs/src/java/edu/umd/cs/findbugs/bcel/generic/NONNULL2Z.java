
package edu.umd.cs.findbugs.bcel.generic;

import org.apache.bcel.Const;

/** A synthetic instruction that converts a reference to a boolean value,
 * translating any nonnull value to 1 (true), and null value to 0 (false).
 *
 */
public class NONNULL2Z extends NullnessConversationInstruction {

    public NONNULL2Z() {
        super(Const.IMPDEP2);
    }
}
